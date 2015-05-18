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
//Standard desktop or laptop computer
COMPUTER

//Mobile phone or similar small mobile device
MOBILE

// Small tablet type computer.
TABLET

//Game console like the Wii or Playstation.
GAME_CONSOLE

//Digital media receiver like the Google TV.
DMR

//Miniature device like a smart watch or interactive glasses
WEARABLE

//Other or unknow type of device.
UNKNOWN
