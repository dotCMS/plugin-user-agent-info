# User Agent Viewtool

## Credit
This tool implements a viewtool that uses the nice user-agent-utils project by Harold Walker.
 
http://www.bitwalker.eu/software/user-agent-utils

## Usage
```
viewtool: $useragent

agent: $useragent.agent
browser: $useragent.browser
version: $useragent.version
os: $useragent.os
manufacturer: $useragent.manufacturer
type: $useragent.type
engine: $useragent.engine
```


The $useragent.type returns one of the following Strings that you can use to check against.

The return values can be 
COMPUTER, MOBILE, TABLET, GAME_CONSOLE, WEARABLE, DMR (Digital media receiver like the Google TV), or UNKNOWN
