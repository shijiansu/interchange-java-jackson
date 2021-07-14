package jackson.by.jenkov._3_annotations.write;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class OptimizedBooleanSerializer extends JsonSerializer<Boolean> {

  @Override
  public void serialize(
      Boolean aBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException, JsonProcessingException {

    if (aBoolean) {
      jsonGenerator.writeNumber(1);
    } else {
      jsonGenerator.writeNumber(0);
    }
  }
}
