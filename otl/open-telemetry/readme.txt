add this to your VM options starting

service-a: -javaagent:open-telemetry/opentelemetry-javaagent.jar -Dotel.service.name=service-a  -Dotel.traces.exporter=otlp  -Dotel.metrics.exporter=otlp -Dotel.logs.exporter=none -Dotel.exporter.otlp.endpoint=http://localhost:4318

service-b: -javaagent:open-telemetry/opentelemetry-javaagent.jar -Dotel.service.name=service-b  -Dotel.traces.exporter=otlp  -Dotel.metrics.exporter=otlp -Dotel.logs.exporter=none -Dotel.exporter.otlp.endpoint=http://localhost:4318