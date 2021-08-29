# common-rest
Library for standard TIKI API responses

###Example Use
`return ApiReplyAOFactory.ok(Object);`

###Abstract Handlers
Includes convenient handlers for standardizing exception
responses and applying missing status & code values to responses

`ApiExceptionHandler`
`ApiReplyHanlder`

import into a spring configuration class with
```
@Import({
    MyApiExceptionHandler.class
})
```