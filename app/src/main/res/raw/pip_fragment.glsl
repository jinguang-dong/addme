#version 300 es
#extension GL_OES_EGL_image_external_essl3 : require

precision mediump float;

uniform vec3 uEdgeColor;
uniform float uStrongThreshold;
uniform float uWeakThreshold;
uniform samplerExternalOES uExternalTex;
uniform vec2 uExternalTexSize;
uniform vec2 uRoiCenter;
uniform float uZoomFactor;
uniform vec2 uPipOffset;
uniform vec2 uPipSize;
uniform float uPipRadius;
uniform float uPipStroke;
uniform float uIsPipVisible;

out vec4 outColor;

const vec2 OFFSET_ZERO = vec2(0.0);
const float ZOOM_1X = 1.0;
const vec3 PIP_FRAME_COLOR = vec3(1.0);
const vec3 RETICULE_FRAME_COLOR = vec3(253.0, 214.0, 99.0) / 255.0;

const mat3 GAUSSIAN_BLUR_MATRIX = mat3(
0.0625, 0.125, 0.0625,
0.125, 0.25, 0.125,
0.0625, 0.125, 0.0625
);

const mat3 SOBEL_H_MATRIX = mat3(
-1.0, 0.0, 1.0,
-2.0, 0.0, 2.0,
-1.0, 0.0, 1.0
);

const mat3 SOBEL_V_MATRIX = mat3(
1.0, 2.0, 1.0,
0.0, 0.0, 0.0,
-1.0, -2.0, -1.0
);

bool isInsideRoundedBox(vec2 coord, vec2 boxCenter, vec2 halfBoxSize, float boxCornerRadius) {
  vec2 interiorHalfBoxSize = halfBoxSize - boxCornerRadius;
  float d = length(max(abs(coord - boxCenter), interiorHalfBoxSize) - interiorHalfBoxSize) - boxCornerRadius;
  return d <= 0.0;
}

float convolve(mat3 a, mat3 b) {
  return dot(a[0], b[0]) + dot(a[1], b[1]) + dot(a[2], b[2]);
}

float blur(vec2 coord) {
  mat3 sampleValues;
  for (int i = -1; i <= 1; i++) {
    for (int j = -1; j <= 1; j++) {
      vec2 dcoord = vec2(float(i), float(j)) / uExternalTexSize;
      sampleValues[i+1][j+1] = length(texture(uExternalTex, coord + dcoord).rgb);
    }
  }
  return convolve(sampleValues, GAUSSIAN_BLUR_MATRIX);
}

vec2 sobel(vec2 coord) {
  mat3 blurredValues;
  for (int i = -1; i <= 1; i++) {
    for (int j = -1; j <= 1; j++) {
      vec2 dcoord = vec2(float(i), float(j)) / uExternalTexSize;
      blurredValues[i+1][j+1] = blur(coord + dcoord);
    }
  }
  float sobelEdgeH = convolve(blurredValues, SOBEL_H_MATRIX);
  float sobelEdgeV = convolve(blurredValues, SOBEL_V_MATRIX);
  return vec2(sobelEdgeH, sobelEdgeV);
}

vec2 getPipTexCoord() {
  return (uRoiCenter + (gl_FragCoord.xy - 0.5 * uPipSize - uPipOffset) / uZoomFactor) / uExternalTexSize;
}

vec2 getViewfinderTexCoord() {
  return gl_FragCoord.xy / uExternalTexSize;
}

vec3 sampleSobelAt(vec2 texCoord) {
  vec2 gradient = sobel(texCoord);
  float edge = smoothstep(uWeakThreshold, uStrongThreshold, length(gradient));
  return mix(texture(uExternalTex, texCoord).rgb, uEdgeColor, edge);
}

void main() {
  vec3 rgbColor = vec3(0.0);

  vec2 halfPipSize = 0.5 * uPipSize;
  float halfPipStroke = 0.5 * uPipStroke;
  vec2 pipCenter = halfPipSize + uPipOffset;
  bool isInsidePipFrame = isInsideRoundedBox(gl_FragCoord.xy, pipCenter, halfPipSize - halfPipStroke, uPipRadius - halfPipStroke);
  bool isOnPipFrame = isInsideRoundedBox(gl_FragCoord.xy, pipCenter, halfPipSize + halfPipStroke, uPipRadius + halfPipStroke) && !isInsidePipFrame;

  if(bool(uIsPipVisible)) {
    if (isInsidePipFrame){
      rgbColor = sampleSobelAt(getPipTexCoord());
    } else if(isOnPipFrame){
      rgbColor = PIP_FRAME_COLOR;

    } else { // outside the PiP frame
      vec2 halfReticuleSize = halfPipSize / uZoomFactor;
      float reticuleRadius = uPipRadius / uZoomFactor;
      bool isInsideReticuleFrame = isInsideRoundedBox(gl_FragCoord.xy, uRoiCenter, halfReticuleSize - halfPipStroke, reticuleRadius - halfPipStroke);
      bool isOnReticuleFrame = isInsideRoundedBox(gl_FragCoord.xy, uRoiCenter, halfReticuleSize + halfPipStroke, reticuleRadius + halfPipStroke) && !isInsideReticuleFrame;
      if (isOnReticuleFrame) {
        rgbColor = RETICULE_FRAME_COLOR;
      } else {
        rgbColor = texture(uExternalTex, getViewfinderTexCoord()).rgb;
      }
    }

  } else {
    rgbColor = sampleSobelAt(getViewfinderTexCoord());
  }

  outColor = vec4(rgbColor, 1.0);
}
