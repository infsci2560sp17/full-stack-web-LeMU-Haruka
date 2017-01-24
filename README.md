# Strategy for Kancolle

1. What is the proposed name for your Web application?
    - Strategy for Kancolle
2. Who is the target audience for your Web application?
    - The Kancolle players who needs game strategy for Winter Event 2016 and normal maps
3. What problem is it intended to solve for the target audience?
    - It will provide strategy for Kancolle players to let them know how to use the ships they have to build a powerful fleet and pass the Winter Event 2016.
4. How will it meet the minimum project requirements?
    - It will provide specific data of enemy fleet, including fleet configuration, how many air force requied for each point in each map and the basic requirement to get to the final battle for each map. What's more, I will provide my own opinion about each map, how to build fleet can have the best change to win the fight. According to my experience before, my strategy was always very helpful. So this time I want to put them on the website to let more people can see it. 
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

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.