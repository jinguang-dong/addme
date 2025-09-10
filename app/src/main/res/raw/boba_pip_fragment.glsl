#version 300 es
#extension GL_OES_EGL_image_external_essl3 : require
#extension GL_EXT_YUV_target : enable

precision mediump float;

uniform samplerExternalOES uImgTex;
uniform float insideRadius;
uniform float outsideRadius;
uniform float insideStroke;
uniform float outsideStroke;
uniform int shouldRenderPipScrim;
uniform vec2 viewportXY;
uniform vec2 viewportSize;
uniform vec2 trackPos;
uniform vec2 trackHalfSize;
uniform vec2 bracketLimit;
uniform vec3 innerColor;
uniform vec3 pipScrimColor;
uniform vec3 pipBorderColor;
in vec2 texCoord;

layout(yuv) out vec4 outColor;

bool roundedBox(vec2 fragCoord, vec2 pos, vec2 size, float radius) {
   float d = length(max(abs(fragCoord - pos),size) - size) - radius;
   return d > 0.0;
}

bool roundedFrame(vec2 fragCoord, vec2 pos, vec2 size, float radius, float border) {
   vec2 dxy = abs(fragCoord - pos);
   float d = length(max(dxy, size) - size) - radius;
   return abs(d) < border && (dxy.x >= bracketLimit.x && dxy.y >= bracketLimit.y);
}

void main() {
    vec2 fragCoord = gl_FragCoord.xy - viewportXY;
    if(roundedBox(fragCoord, 0.5 * viewportSize,
        0.5 * viewportSize - outsideRadius - outsideStroke,
        outsideRadius + outsideStroke)){
        discard;
    }
    float pipFrame = float(roundedBox(fragCoord, 0.5 * viewportSize, 0.5 *
    viewportSize - outsideRadius - outsideStroke, outsideRadius));
    float bbox = float(roundedFrame(fragCoord, trackPos,
         trackHalfSize - insideRadius + insideStroke, insideRadius, insideStroke));
    vec3 textureColor = texture(uImgTex, texCoord).rgb;
    if (shouldRenderPipScrim == 1) {
        textureColor = texture(uImgTex, texCoord).rgb * pipScrimColor;
    }
    vec3 rgbColor = bbox * innerColor + (1.0 - bbox) * textureColor;
    if (bool(pipFrame)) {
        rgbColor = vec3(pipBorderColor);
    }
    outColor = vec4(rgb_2_yuv(rgbColor, itu_601_full_range), 1.0);
}
