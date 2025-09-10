#version 300 es

precision mediump float;

in vec2 vTexCoord;

uniform sampler2D uYTexture;
uniform sampler2D uUTexture;
uniform sampler2D uVTexture;
uniform float uRadius;
uniform vec2 uResolution;
uniform float uPercentImage;

out vec4 oFragColor;

bool isInsideRoundedBox(vec2 coord,
                        vec2 boxCenter,
                        vec2 halfBoxSize,
                        float radius) {
  vec2 interiorHalfBoxSize = halfBoxSize - radius;
  vec2 absCoordBoxCenter = abs(coord - boxCenter);
  if (any(lessThan(absCoordBoxCenter, interiorHalfBoxSize))) {
    return true;
  }
  vec2 coordCornerCenter = absCoordBoxCenter - interiorHalfBoxSize;
  return dot(coordCornerCenter, coordCornerCenter) <= (radius * radius);
}

void main (void) {
  float r, g, b, y, u, v;

  vec2 halfBoxSize = uResolution * 0.5;
  if (!isInsideRoundedBox(gl_FragCoord.xy,
                          halfBoxSize,
                          halfBoxSize,
                          uRadius)) {
    discard;
  }

  // LINT.IfChange(solid_color)
  if (uPercentImage == 0.0) {
    // Separately handle case of full solid to avoid requiring the texture to be set
    r = 0.0;
    g = 0.0;
    b = 0.0;
  } else {
    y = texture(uYTexture, vTexCoord).r;
    u = texture(uUTexture, vTexCoord).r - 0.5;
    v = texture(uVTexture, vTexCoord).r - 0.5;

    // Since the solid color is (0,0,0), the image channels can simply be multiplied by
    // uPercentImage to blend between the two
    r = uPercentImage * (y + 1.13983*v);
    g = uPercentImage * (y - 0.39465*u - 0.58060*v);
    b = uPercentImage * (y + 2.03211*u);
  }
  // LINT.ThenChange()
  oFragColor = vec4(r, g, b, 1);
}
