# Strategy for Kancolle

1. What is the proposed name for your Web application?
    - Strategy for Kancolle
2. Who is the target audience for your Web application?
    - The Kancolle players who needs game strategy for Winter Event 2016 and normal maps
3. What problem is it intended to solve for the target audience?
    - It will provide strategy for Kancolle players to let them know how to use the ships they have to build a powerful fleet and pass the Winter Event 2016.
4. How will it meet the minimum project requirements?
    - It will provide specific data of enemy fleet, including fleet configuration, how many air force requied for each point in each map and the basic requirement to get to the final battle for each map. What's more, I will provide my own opinion about each map, how to build fleet can have the best chance to win the fight. According to my experience before, my strategy was always very helpful. So this time I want to put them on the website to let more people can see it. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - Nomally, the strategy is published on the BBS or facebook just as what I did before. Both of them have lots of format limitations. For example, I prefer to show all configurations of enemy. On BBS, it will take a big part of page, so that the whole strategy seems expatiatory and the visual effect is so bad, so I normally will ignore this part and reply it in the comments when somebody have question about it. This is not easy for all people to see. Thus, if building a web application, it can have a better visual effect and meet all players' need.
     
## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-LeMU-Haruka.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-LeMU-Haruka)

## Changelog
[Changelog](CHANGELOG.md)

## Web Site

https://lemu-harukaweb.herokuapp.com/

![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/kancolle.jpg)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

This is a greeting page for all users,temprory. Will be changed to a better one soon!
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/home.jpg)

### User Input Form

This page user can input there comment to communicate with both website owner and other users.
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/kancolle.jpg)

### data page

This is the mapdata page will show every sea area and maps in this area. Will add more data and picture of each map soon!
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/mapdata.jpg)

This is enemyfleet page shows every enemy fleet in each map. In order to make it clear the fleet can show and hide, which will only show exactly the map want to see in the future. More data and functions will be added soon!
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/enemyfleetshow.jpg)
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/enemyfleethide.jpg)

This is enemy ship page. Show each enemy ship's data. Will add image in the future.
![](https://github.com/infsci2560sp17/full-stack-web-LeMU-Haruka/blob/master/bmp/enemy.jpg)

## API

### API Method 1

    GET enemy/:apijson

#### Response

A JSON or XMLobject containing all enemy data

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **500 internal server error** — The enemy service errored.


#### Example

##### Request

    GET /enemy/apijson

##### JSON Response

```json
{"id":2,"name":"驱逐イ级","fire":6,"armor":5,"torp":15,"antiair":6,"escape":14,"type":"Destroyer","aa":6,"hp":20},
{"id":3,"name":"驱逐ロ级","fire":7,"armor":6,"torp":16,"antiair":7,"escape":15,"type":"Destroyer","aa":7,"hp":22}
```

### API Method 2

    delete Kancolle/delete/{id}
    

#### Parameters
    
- **id** _(required)_ — The id for comment need to delete

#### Response

The page show the comment already deleted.

#### Example

##### Request

    delete Kancolle/delete/1

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.