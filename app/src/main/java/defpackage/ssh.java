package defpackage;

import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssh implements tpl {
    static final tpl a = new ssh();

    private ssh() {
    }

    @Override // defpackage.tpl
    public final boolean a(int i) {
        ssi ssiVar;
        switch (i) {
            case 0:
                ssiVar = ssi.UNKNOWN;
                break;
            case 1:
                ssiVar = ssi.TIMER_ZERO_SECONDS;
                break;
            case 2:
                ssiVar = ssi.TIMER_THREE_SECONDS;
                break;
            case 3:
                ssiVar = ssi.TIMER_TEN_SECONDS;
                break;
            case 4:
                ssiVar = ssi.TIMER_AUTO;
                break;
            case 5:
                ssiVar = ssi.HDR_AUTO;
                break;
            case 6:
                ssiVar = ssi.HDR_ON;
                break;
            case 7:
                ssiVar = ssi.HDR_OFF;
                break;
            case 8:
                ssiVar = ssi.HDR_READY;
                break;
            case 9:
                ssiVar = ssi.PHOTO_FLASH_ON;
                break;
            case 10:
                ssiVar = ssi.PHOTO_FLASH_OFF;
                break;
            case 11:
                ssiVar = ssi.PHOTO_FLASH_AUTO;
                break;
            case 12:
                ssiVar = ssi.PHOTO_FLASH_GRAYED;
                break;
            case 13:
                ssiVar = ssi.PHOTO_FLASH_UNGRAYED;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ssiVar = ssi.VIDEO_FLASH_ON;
                break;
            case 15:
                ssiVar = ssi.VIDEO_FLASH_OFF;
                break;
            case 16:
                ssiVar = ssi.MICROVIDEO_ON;
                break;
            case 17:
                ssiVar = ssi.MICROVIDEO_AUTO;
                break;
            case 18:
                ssiVar = ssi.MICROVIDEO_OFF;
                break;
            case 19:
                ssiVar = ssi.EXT_MICROPHONE_ON;
                break;
            case 20:
                ssiVar = ssi.EXT_MICROPHONE_OFF;
                break;
            case 21:
                ssiVar = ssi.FPS_AUTO;
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                ssiVar = ssi.FPS_30;
                break;
            case 23:
                ssiVar = ssi.FPS_60;
                break;
            case 24:
                ssiVar = ssi.WHITE_BALANCE_AUTO;
                break;
            case 25:
                ssiVar = ssi.WHITE_BALANCE_CLOUDY;
                break;
            case 26:
                ssiVar = ssi.WHITE_BALANCE_SUNNY;
                break;
            case 27:
                ssiVar = ssi.WHITE_BALANCE_INCANDESCENT;
                break;
            case 28:
                ssiVar = ssi.WHITE_BALANCE_FLUORESCENT;
                break;
            case 29:
                ssiVar = ssi.BEAUTIFICATION_ON_LIGHT;
                break;
            case 30:
                ssiVar = ssi.BEAUTIFICATION_ON_STRONG;
                break;
            case 31:
                ssiVar = ssi.BEAUTIFICATION_OFF;
                break;
            case 32:
                ssiVar = ssi.AF_ON;
                break;
            case 33:
                ssiVar = ssi.AF_ON_LOCKED;
                break;
            case 34:
                ssiVar = ssi.AF_OFF_NEAR;
                break;
            case ImageFormat.YUV_420_888 /* 35 */:
                ssiVar = ssi.AF_OFF_FAR;
                break;
            case 36:
                ssiVar = ssi.P;
                break;
            case 37:
                ssiVar = ssi.IMAX_AUDIO_OFF;
                break;
            case 38:
                ssiVar = ssi.SELECTED;
                break;
            case 39:
                ssiVar = ssi.UNSELECTED;
                break;
            case 40:
                ssiVar = ssi.HORIZONTAL_PHOTO_SPHERE;
                break;
            case 41:
                ssiVar = ssi.VERTICAL_PHOTO_SPHERE;
                break;
            case 42:
                ssiVar = ssi.WIDE_ANGLE_PHOTO_SPHERE;
                break;
            case 43:
                ssiVar = ssi.W;
                break;
            case 44:
                ssiVar = ssi.PHOTO_SPHERE;
                break;
            case 45:
                ssiVar = ssi.AF_OFF_INFINITY;
                break;
            case 46:
                ssiVar = ssi.SIXTEEN_BY_NINE;
                break;
            case 47:
                ssiVar = ssi.FOUR_BY_THREE;
                break;
            case 48:
                ssiVar = ssi.FPS_24;
                break;
            case 49:
                ssiVar = ssi.RES_1080P;
                break;
            case 50:
                ssiVar = ssi.RES_2160P;
                break;
            case 51:
                ssiVar = ssi.PR_ON;
                break;
            case 52:
                ssiVar = ssi.PR_OFF;
                break;
            case 53:
                ssiVar = ssi.ASTRO_OFF;
                break;
            case 54:
                ssiVar = ssi.ASTRO_AUTO;
                break;
            case 55:
                ssiVar = ssi.PHOTO_FLASH_NS;
                break;
            case 56:
                ssiVar = ssi.MIC_INPUT_PHONE;
                break;
            case 57:
                ssiVar = ssi.MIC_INPUT_EXT_WIRED;
                break;
            case 58:
                ssiVar = ssi.MIC_INPUT_EXT_BLUETOOTH;
                break;
            case 59:
                ssiVar = ssi.SWISS_OFF;
                break;
            case 60:
                ssiVar = ssi.SWISS_ON;
                break;
            case 61:
                ssiVar = ssi.LASAGNA_TR_SMALL;
                break;
            case 62:
                ssiVar = ssi.LASAGNA_TR_MEDIUM;
                break;
            case 63:
                ssiVar = ssi.ao;
                break;
            case 64:
                ssiVar = ssi.FLOUNDER_OFF;
                break;
            case 65:
                ssiVar = ssi.FLOUNDER_ON;
                break;
            case 66:
                ssiVar = ssi.ASPECT_RATIO_SIXTEEN_BY_NINE;
                break;
            case 67:
                ssiVar = ssi.ASPECT_RATIO_FOUR_BY_THREE;
                break;
            case 68:
                ssiVar = ssi.ASPECT_RATIO_THREE_BY_FOUR;
                break;
            case 69:
                ssiVar = ssi.ASPECT_RATIO_NINE_BY_SIXTEEN;
                break;
            case 70:
                ssiVar = ssi.COCKTAIL_PARTY_OFF;
                break;
            case 71:
                ssiVar = ssi.COCKTAIL_PARTY_ON;
                break;
            case 72:
                ssiVar = ssi.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE;
                break;
            case 73:
                ssiVar = ssi.VIDEO_ASPECT_RATIO_FOUR_BY_THREE;
                break;
            case 74:
                ssiVar = ssi.VIDEO_ASPECT_RATIO_THREE_BY_FOUR;
                break;
            case 75:
                ssiVar = ssi.VIDEO_ASPECT_RATIO_NINE_BY_SIXTEEN;
                break;
            case 76:
                ssiVar = ssi.AMETHYST_OFF;
                break;
            case 77:
                ssiVar = ssi.AMETHYST_ON;
                break;
            case 78:
                ssiVar = ssi.TAXI_OFF;
                break;
            case 79:
                ssiVar = ssi.TAXI_AUTO;
                break;
            case 80:
                ssiVar = ssi.TAXI_ON;
                break;
            case 81:
                ssiVar = ssi.CAPTURE_RESOLUTION_DEFAULT;
                break;
            case 82:
                ssiVar = ssi.CAPTURE_RESOLUTION_HI_RES;
                break;
            case 83:
                ssiVar = ssi.VIDEO_STABILIZATION_STANDARD;
                break;
            case 84:
                ssiVar = ssi.VIDEO_STABILIZATION_LOCKED;
                break;
            case 85:
                ssiVar = ssi.VIDEO_STABILIZATION_ACTIVE;
                break;
            case 86:
                ssiVar = ssi.SAPPHIRE_OFF;
                break;
            case 87:
                ssiVar = ssi.SAPPHIRE_ON;
                break;
            case 88:
                ssiVar = ssi.VIDEO_FLASH_NS;
                break;
            case 89:
                ssiVar = ssi.ARK_SH_LESS;
                break;
            case 90:
                ssiVar = ssi.ARK_SH_NORMAL;
                break;
            case 91:
                ssiVar = ssi.ARK_SH_MORE;
                break;
            case 92:
                ssiVar = ssi.ARK_LA;
                break;
            case 93:
                ssiVar = ssi.ARK_LM;
                break;
            case 94:
                ssiVar = ssi.TIMER_FIVE_SECONDS;
                break;
            case 95:
                ssiVar = ssi.RES_4320P;
                break;
            case 96:
            default:
                ssiVar = null;
                break;
            case 97:
                ssiVar = ssi.SERENGETI_NS_OFF;
                break;
            case 98:
                ssiVar = ssi.SERENGETI_NS_AUTO;
                break;
            case 99:
                ssiVar = ssi.SERENGETI_NS_ON;
                break;
            case 100:
                ssiVar = ssi.SERENGETI_MODE_DEFAULT;
                break;
            case 101:
                ssiVar = ssi.SERENGETI_MODE_ALTERNATE;
                break;
            case 102:
                ssiVar = ssi.FEATURE_SOUND_EFFECTS_OFF;
                break;
            case 103:
                ssiVar = ssi.FEATURE_SOUND_EFFECTS_ON;
                break;
            case 104:
                ssiVar = ssi.MOTION_PHOTO_OFF;
                break;
            case 105:
                ssiVar = ssi.MOTION_PHOTO_AUTO;
                break;
            case 106:
                ssiVar = ssi.MOTION_PHOTO_ON;
                break;
        }
        return ssiVar != null;
    }
}
