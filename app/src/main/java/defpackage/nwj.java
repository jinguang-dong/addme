package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.support.v7.widget.RecyclerView;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.wear.widget.CurvedTextView;
import com.google.android.gms.common.api.Status;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nwj {
    public static Point a(kq kqVar, View view) {
        if (kqVar == null) {
            return new Point(0, 0);
        }
        Rect rect = new Rect();
        kqVar.aF(view, rect);
        return new Point((rect.left - rect.right) / 2, (rect.top - rect.bottom) / 2);
    }

    public static int b(nxt nxtVar, RecyclerView recyclerView, boolean z) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0 || !nxtVar.g(recyclerView.getChildAt(0))) {
            if (z) {
                return nxtVar.d(recyclerView) / 2;
            }
            if (childCount != 0) {
                int iMax = -2147483647;
                int iMin = Integer.MAX_VALUE;
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iB = nxtVar.b(childAt);
                    int iD = nxtVar.d(childAt) / 2;
                    iMin = Math.min(iMin, iB - iD);
                    iMax = Math.max(iMax, iB + iD);
                }
                return (nxtVar.d(recyclerView) - (iMax - iMin)) / 2;
            }
        }
        return 0;
    }

    public static int[] c() {
        return new int[]{1, 2};
    }

    public static int d(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 25:
            case 27:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
            case 46:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            case 61:
            case 62:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 75:
            case 80:
            case 81:
            case 83:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 96:
            case 101:
            case 109:
            case ScriptIntrinsicBLAS.TRANSPOSE /* 112 */:
            case 114:
            case 124:
            case 125:
            case 127:
            case 128:
            case 129:
            case 130:
            case ScriptIntrinsicBLAS.NON_UNIT /* 131 */:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 183:
            case 187:
            case 188:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 231:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 252:
            case 257:
            case 258:
            case 264:
            case 272:
            case 274:
            case 275:
            case 283:
            case 303:
            case 318:
            case 328:
            default:
                return 0;
            case 7:
                return 7;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 14;
            case 16:
                return 16;
            case 18:
                return 18;
            case 24:
                return 24;
            case 26:
                return 26;
            case 29:
                return 29;
            case 30:
                return 30;
            case 32:
                return 32;
            case 33:
                return 33;
            case ImageFormat.YUV_420_888 /* 35 */:
                return 35;
            case 38:
                return 38;
            case 39:
                return 39;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 51:
                return 51;
            case 57:
                return 57;
            case 58:
                return 58;
            case 60:
                return 60;
            case 63:
                return 63;
            case 64:
                return 64;
            case 67:
                return 67;
            case 74:
                return 74;
            case 76:
                return 76;
            case 77:
                return 77;
            case 78:
                return 78;
            case 79:
                return 79;
            case 82:
                return 82;
            case 84:
                return 84;
            case 85:
                return 85;
            case 88:
                return 88;
            case 94:
                return 94;
            case 95:
                return 95;
            case 97:
                return 97;
            case 98:
                return 98;
            case 99:
                return 99;
            case 100:
                return 100;
            case 102:
                return 102;
            case 103:
                return 103;
            case 104:
                return 104;
            case 105:
                return 105;
            case 106:
                return 106;
            case 107:
                return 107;
            case 108:
                return 108;
            case 110:
                return 110;
            case ScriptIntrinsicBLAS.NO_TRANSPOSE /* 111 */:
                return ScriptIntrinsicBLAS.NO_TRANSPOSE;
            case ScriptIntrinsicBLAS.CONJ_TRANSPOSE /* 113 */:
                return ScriptIntrinsicBLAS.CONJ_TRANSPOSE;
            case 115:
                return 115;
            case 116:
                return 116;
            case 117:
                return 117;
            case 118:
                return 118;
            case 119:
                return 119;
            case 120:
                return 120;
            case ScriptIntrinsicBLAS.UPPER /* 121 */:
                return ScriptIntrinsicBLAS.UPPER;
            case ScriptIntrinsicBLAS.LOWER /* 122 */:
                return ScriptIntrinsicBLAS.LOWER;
            case 123:
                return 123;
            case 126:
                return 126;
            case ScriptIntrinsicBLAS.UNIT /* 132 */:
                return ScriptIntrinsicBLAS.UNIT;
            case 133:
                return 133;
            case 134:
                return 134;
            case 135:
                return 135;
            case 136:
                return 136;
            case ScriptIntrinsicBLAS.LEFT /* 141 */:
                return ScriptIntrinsicBLAS.LEFT;
            case ScriptIntrinsicBLAS.RIGHT /* 142 */:
                return ScriptIntrinsicBLAS.RIGHT;
            case 143:
                return 143;
            case 145:
                return 145;
            case 146:
                return 146;
            case 148:
                return 148;
            case 150:
                return 150;
            case 151:
                return 151;
            case 152:
                return 152;
            case 153:
                return 153;
            case 154:
                return 154;
            case 180:
                return 180;
            case 182:
                return 182;
            case 184:
                return 184;
            case 185:
                return 185;
            case 186:
                return 186;
            case 189:
                return 189;
            case 194:
                return 194;
            case 200:
                return 200;
            case 202:
                return 202;
            case 203:
                return 203;
            case 204:
                return 204;
            case 205:
                return 205;
            case 206:
                return 206;
            case 218:
                return 218;
            case 219:
                return 219;
            case 220:
                return 220;
            case 221:
                return 221;
            case 223:
                return 223;
            case 227:
                return 227;
            case 228:
                return 228;
            case 232:
                return 232;
            case 233:
                return 233;
            case 240:
                return 240;
            case 241:
                return 241;
            case 242:
                return 242;
            case 243:
                return 243;
            case 244:
                return 244;
            case 245:
                return 245;
            case 246:
                return 246;
            case 247:
                return 247;
            case 248:
                return 248;
            case 249:
                return 249;
            case 250:
                return 250;
            case 251:
                return 251;
            case 253:
                return 253;
            case 254:
                return 254;
            case 255:
                return 255;
            case 256:
                return 256;
            case 259:
                return 259;
            case 260:
                return 260;
            case 261:
                return 261;
            case 262:
                return 262;
            case 263:
                return 263;
            case 265:
                return 265;
            case 266:
                return 266;
            case 267:
                return 267;
            case 268:
                return 268;
            case 269:
                return 269;
            case 270:
                return 270;
            case 271:
                return 271;
            case 273:
                return 273;
            case 276:
                return 276;
            case 277:
                return 277;
            case 278:
                return 278;
            case 279:
                return 279;
            case 280:
                return 280;
            case 281:
                return 281;
            case 282:
                return 282;
            case 284:
                return 284;
            case 285:
                return 285;
            case 286:
                return 286;
            case 287:
                return 287;
            case 288:
                return 288;
            case 289:
                return 289;
            case 290:
                return 290;
            case 291:
                return 291;
            case 292:
                return 292;
            case 293:
                return 293;
            case 294:
                return 294;
            case 295:
                return 295;
            case 296:
                return 296;
            case 297:
                return 297;
            case 298:
                return 298;
            case 299:
                return 299;
            case 300:
                return 300;
            case 301:
                return 301;
            case 302:
                return 302;
            case 304:
                return 304;
            case 305:
                return 305;
            case 306:
                return 306;
            case 307:
                return 307;
            case 308:
                return 308;
            case 309:
                return 309;
            case 310:
                return 310;
            case 311:
                return 311;
            case 312:
                return 312;
            case 313:
                return 313;
            case 314:
                return 314;
            case 315:
                return 315;
            case 316:
                return 316;
            case 317:
                return 317;
            case 319:
                return 319;
            case 320:
                return 320;
            case 321:
                return 321;
            case 322:
                return 322;
            case 323:
                return 323;
            case 324:
                return 324;
            case 325:
                return 325;
            case 326:
                return 326;
            case 327:
                return 327;
            case 329:
                return 329;
        }
    }

    public static final float e(float f) {
        return (1.0f - (1.0f - (f + f))) * 0.5f;
    }

    public static final float f(float f) {
        return (((f + f) - 1.0f) + 1.0f) / 2.0f;
    }

    public static long g(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jV = v(bArr2, 0) * (-5435081209227447693L);
                long jV2 = v(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long jV3 = v(bArr2, length - 8) * j2;
                return u(Long.rotateRight(jV + jV2, 43) + Long.rotateRight(jV3, 30) + (v(bArr2, length - 16) * (-7286425919675154353L)), jV + Long.rotateRight(jV2 - 7286425919675154353L, 18) + jV3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long jV4 = v(bArr2, 0) - 7286425919675154353L;
                long jV5 = v(bArr2, length - 8);
                return u((Long.rotateRight(jV5, 37) * j3) + jV4, (Long.rotateRight(jV4, 25) + jV5) * j3, j3);
            }
            if (length >= 4) {
                return u(length + ((t(bArr2, 0) & 4294967295L) << 3), t(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return w((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long jV6 = v(bArr2, 0) * (-7286425919675154353L);
            long jV7 = v(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long jV8 = v(bArr2, length - 8) * j4;
            long jV9 = v(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jV6 + jV7, 43) + Long.rotateRight(jV8, 30);
            long jRotateRight2 = Long.rotateRight(jV7 - 7286425919675154353L, 18) + jV6;
            long jV10 = v(bArr2, 16) * j4;
            long jV11 = v(bArr2, 24);
            long j5 = jRotateRight + jV9;
            long jV12 = j5 + v(bArr2, length - 32);
            long j6 = jV12 * j4;
            return u(Long.rotateRight(jV10 + jV11, 43) + Long.rotateRight(j6, 30) + ((u(j5, jRotateRight2 + jV8, j4) + v(bArr2, length - 24)) * j4), jV10 + Long.rotateRight(jV11 + jV6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jV13 = v(bArr2, 0) + 95310865018149119L;
        long jW = w(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight3 = Long.rotateRight(jV13 + j7 + jArr[z2 ? 1 : 0] + v(bArr2, i + 8), 37) * j;
            long jRotateRight4 = Long.rotateRight(j7 + jArr[1] + v(bArr2, i + 48), 42) * j;
            long j8 = jRotateRight3 ^ jArr2[1];
            long j9 = j;
            long jV14 = v(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight5 = Long.rotateRight(jW + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            x(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = jRotateRight4 + jV14;
            x(bArr2, i4 + 32, jRotateRight5 + jArr2[1], v(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j7 + j13 + v(bArr2, i6 - 55), 37) * j11;
                long jRotateRight7 = Long.rotateRight(j7 + jArr3[1] + v(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long jV15 = (jArr3[z2 ? 1 : 0] * 9) + v(bArr2, i6 - 23);
                long jRotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = jRotateRight6 ^ j14;
                x(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = jRotateRight7 + jV15;
                x(bArr2, i6 - 31, jArr2[1] + jRotateRight8, v(bArr2, i6 - 47) + j16, jArr2);
                return u(u(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (w(j16) * (-4348849565147123417L)) + j15, u(jArr3[1], jArr2[1], j11) + jRotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            jW = j8;
            j = j9;
            jV13 = jRotateRight5;
            jArr = jArr3;
        }
    }

    public static boolean h(Context context, String str, boolean z) throws PackageManager.NameNotFoundException {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                if (!z) {
                    return true;
                }
                if (receiverInfo.exported) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static obi i(int i, obu obuVar, oan oanVar) {
        try {
            return y(oanVar.b.b.getResources().getXml(i), obuVar, oanVar);
        } catch (Resources.NotFoundException e) {
            oanVar.u("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    public static int j(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogPreferenceStyle, typedValue, true);
        return typedValue.type != 0 ? R.attr.dialogPreferenceStyle : android.R.attr.dialogPreferenceStyle;
    }

    public static void k(TypedArray typedArray) {
        typedArray.getResourceId(2, typedArray.getResourceId(6, 0));
    }

    public static int l(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static nyy m(View view) {
        if (view instanceof TextView) {
            return new nyw((TextView) view);
        }
        if (view instanceof CurvedTextView) {
            return new nyv((CurvedTextView) view);
        }
        throw new IllegalArgumentException("Parameter must be of type TextView or CurvedTextView");
    }

    public static float n(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? "VIDEO" : "AUDIO";
    }

    public static final rwc p(int i, oxm oxmVar) {
        oxmVar.toString();
        int i2 = oxmVar.e == 2 ? 12 : 16;
        int i3 = oxmVar.d;
        int minBufferSize = AudioRecord.getMinBufferSize(i3, i2, 2) * 10;
        try {
            int i4 = i - 1;
            if (i == 0) {
                throw null;
            }
            AudioRecord audioRecord = new AudioRecord(i4, i3, i2, 2, minBufferSize);
            boolean z = true;
            if (audioRecord.getState() != 1) {
                z = false;
            }
            rnt.L(z);
            return rwc.j(audioRecord);
        } catch (RuntimeException e) {
            Log.e("AudioRecordFactory", "Could not create AudioRecord", e);
            return rvk.a;
        }
    }

    public static final MediaCodec q(oxs oxsVar) throws oxr {
        try {
            return MediaCodec.createEncoderByType(oxsVar.a());
        } catch (IOException e) {
            throw new oxr(oxsVar, e);
        }
    }

    public static Status r(int i) {
        String strB;
        switch (i) {
            case 4000:
                strB = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strB = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strB = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strB = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strB = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strB = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strB = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strB = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strB = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strB = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strB = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strB = lpa.B(i);
                break;
            case 4012:
                strB = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strB = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strB = "FEATURE_DISABLED";
                break;
            case 4015:
                strB = "WIFI_CONNECTION_FAILED";
                break;
        }
        return new Status(i, strB);
    }

    public static final void s(String str, Object... objArr) {
        Log.e("WakeLock", String.format(str, objArr));
    }

    private static int t(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long u(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long v(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long w(long j) {
        return j ^ (j >>> 47);
    }

    private static void x(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jV = j + v(bArr, i);
        long jV2 = v(bArr, i + 8);
        long jV3 = v(bArr, i + 16);
        long jV4 = v(bArr, i + 24);
        long j3 = jV2 + jV + jV3;
        long jRotateRight = Long.rotateRight(j2 + jV + jV4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jV4;
        jArr[1] = jRotateRight + jV;
    }

    private static final obi y(XmlResourceParser xmlResourceParser, obu obuVar, oan oanVar) throws NumberFormatException {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue)) {
                            TextUtils.isEmpty(strTrim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && strTrim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                ((obi) obuVar.a).a = strTrim2;
                            } else if ("ga_appVersion".equals(attributeValue2)) {
                                ((obi) obuVar.a).b = strTrim2;
                            } else if ("ga_logLevel".equals(attributeValue2)) {
                                ((obi) obuVar.a).c = strTrim2;
                            } else {
                                ((oar) obuVar.b).d().u("String xml configuration name not recognized", attributeValue2);
                            }
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(strTrim3)) {
                            try {
                                boolean z = Boolean.parseBoolean(strTrim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    ((obi) obuVar.a).e = z ? 1 : 0;
                                } else {
                                    ((oar) obuVar.b).d().u("Bool xml configuration name not recognized", attributeValue3);
                                }
                            } catch (NumberFormatException e) {
                                oanVar.v("Error parsing bool configuration value", strTrim3, e);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue(null, "name");
                        String strTrim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(strTrim4)) {
                            try {
                                int i = Integer.parseInt(strTrim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    ((obi) obuVar.a).d = i;
                                } else {
                                    ((oar) obuVar.b).d().u("Int xml configuration name not recognized", attributeValue4);
                                }
                            } catch (NumberFormatException e2) {
                                oanVar.v("Error parsing int configuration value", strTrim4, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e3) {
            oanVar.o("Error parsing tracker configuration file", e3);
        } catch (XmlPullParserException e4) {
            oanVar.o("Error parsing tracker configuration file", e4);
        }
        return (obi) obuVar.a;
    }
}
