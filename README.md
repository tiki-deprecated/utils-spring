# Utils Spring

A simple collection of POJOs and classes that would otherwise be commonly duplicated across TIKI's microservices. 

### Installation

```
<dependency>
  <groupId>com.mytiki</groupId>
  <artifactId>spring_rest_api</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Example

```
import com.mytiki.spring_rest_api.ApiExceptionBuilder;
import org.springframework.http.HttpStatus;

throw new ApiExceptionBuilder(HttpStatus.BAD_REQUEST)
                    .message("Request Failed")
                    .detail("XYZ went wrong")
                    .help("Try again")
                    .build();
```
