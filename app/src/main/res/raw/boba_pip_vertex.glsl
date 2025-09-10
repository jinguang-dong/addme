#version 300 es

in vec2 aPosition;
in vec2 aTexCoord;
out vec2 texCoord;
uniform float zoomFactor;

void main() {
  texCoord = (aTexCoord - 0.5f) * zoomFactor + 0.5f ;
  gl_Position = vec4(aPosition.xy, 0.0, 1.0);
}
