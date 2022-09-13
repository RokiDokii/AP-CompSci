# importing depenedancies
import hashlib, json, urllib
from http.server import BaseHTTPRequestHandler, HTTPServer 

hostName = "localhost"
serverPort = 8080
link = input("Insert Link: ")
if link.startswith("https://" or "http://"): # Works only if 
    newLinkEncoded = link.encode(encoding='UTF-8',errors='strict') 
    newLink = hashlib.sha512(newLinkEncoded).hexdigest()
    shorts = {
        "Link": link
    }
    json_object = json.dumps(shorts, indent=1)
    with open(newLink[0:6]+".json", "w") as outfile:
        outfile.write(json_object)
    class MyServer(BaseHTTPRequestHandler):
        def do_GET(self):
            imsi = str(urllib.parse.parse_qs(urllib.parse.urlsplit(self.path).query).get('l', None))
            shortLinks = json.load(open(f'{imsi[2:8]}.json'))
            self.send_response(302)
            self.send_header('Location', shortLinks['Link'])
            self.end_headers()
if __name__ == "__main__":        
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started http://%s:%s" % (hostName, serverPort))
    webServer.serve_forever()
else:
    print("Invalid Link.")
