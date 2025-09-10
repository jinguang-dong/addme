package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lnl implements Comparable, paq {
    private final int B;
    private final int C;
    private final boolean D;
    private final boolean E;
    private final float F;
    private final byte G;
    private final MeteringRectangle[] H;
    public final pnx a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final long o;
    public final Rect p;
    public final float q;
    public final lno[] r;
    public final lno[] s;
    public final boolean t;
    public final int u;
    public final Rect v;
    public final int w;
    public final int x;
    public final Map y;
    private static final sgv z = sgv.g("lnl");
    private static final MeteringRectangle[] A = {new MeteringRectangle(0, 0, 0, 0, 0)};

    public lnl(pnx pnxVar, int i, Rect rect) {
        this(pnxVar, i, rect, null, (Rect) pnxVar.a(CaptureResult.SCALER_CROP_REGION));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [pnx] */
    /* JADX WARN: Type inference failed for: r8v7, types: [pnx] */
    public static lnl a(poe poeVar, nms nmsVar, int i) {
        Rect rect;
        poe poeVar2;
        poe poeVar3;
        String str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (rnt.V(str)) {
            rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
            poeVar3 = poeVar;
        } else {
            Map mapG = poeVar.g();
            if (mapG.isEmpty()) {
                rect = null;
                poeVar3 = poeVar;
            } else {
                if (mapG.containsKey(str)) {
                    poeVar2 = (pnx) mapG.get(str);
                } else {
                    Map.Entry entry = (Map.Entry) mapG.entrySet().iterator().next();
                    str = (String) entry.getKey();
                    poeVar2 = (pnx) entry.getValue();
                }
                rect = (Rect) poeVar2.a(CaptureResult.SCALER_CROP_REGION);
                poeVar3 = poeVar2;
            }
        }
        poe poeVar4 = poeVar3;
        String str2 = str;
        Rect rect2 = (Rect) nmsVar.b(str2).m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new lnl(poeVar4, i, rect2, str2, rect == null ? rect2 : rect);
    }

    private static Object b(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.c, ((lnl) obj).c);
    }

    public final String toString() {
        MeteringRectangle[] meteringRectangleArr = this.H;
        Rect rect = this.v;
        lno[] lnoVarArr = this.s;
        lno[] lnoVarArr2 = this.r;
        String strValueOf = String.valueOf(this.p);
        String string = Arrays.toString(lnoVarArr2);
        String string2 = Arrays.toString(lnoVarArr);
        String strValueOf2 = String.valueOf(rect);
        String string3 = Arrays.toString(meteringRectangleArr);
        StringBuilder sb = new StringBuilder("CameraMetadata{, timestampNs=");
        sb.append(this.c);
        sb.append(", exposureTime=");
        sb.append(this.d);
        sb.append(", rollingShutterTime=");
        sb.append(this.e);
        sb.append(", focalLength=");
        sb.append(this.h);
        sb.append(mNLbzhCxd.DmIUXyVDYrY);
        sb.append(this.f);
        sb.append(JvFFEwFNdCrxf.uay);
        sb.append(this.i);
        sb.append(", aFStatus=");
        sb.append(this.k);
        sb.append(", aEStatus=");
        sb.append(this.l);
        sb.append(", aWBStatus=");
        sb.append(this.m);
        sb.append(", lensStatus=");
        sb.append(this.n);
        sb.append(", cropRegion=");
        sb.append(strValueOf);
        sb.append(", mTimestampBootime=");
        sb.append(this.o);
        sb.append(", subjectMotion=");
        sb.append(this.q);
        sb.append(", faces=");
        sb.append(string);
        sb.append(", petFaces=");
        sb.append(string2);
        sb.append(", rotationDegrees=");
        sb.append(this.u);
        sb.append(", activeArraySize=");
        sb.append(strValueOf2);
        sb.append(", physicalId=");
        sb.append(this.b);
        sb.append(", controlMode=");
        sb.append(this.w);
        sb.append(", aeMode=");
        sb.append(this.x);
        sb.append(", aFMode=");
        sb.append(this.B);
        sb.append(", aWBMode=");
        sb.append(this.C);
        float f = this.j;
        byte b = this.G;
        float f2 = this.F;
        boolean z2 = this.E;
        boolean z3 = this.D;
        sb.append(", aELock=");
        sb.append(z3);
        sb.append(", aWBLock=");
        sb.append(z2);
        sb.append(", lenseAperture=");
        sb.append(f2);
        sb.append(", jpegQuality=");
        sb.append((int) b);
        sb.append(", autoFocusRegions=");
        sb.append(string3);
        sb.append(", hdrRatio=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:4)(1:5)|6|(1:8)(1:9)|10|(2:15|(14:17|(10:20|(1:22)(1:23)|24|(1:26)(1:27)|28|(1:30)(1:31)|32|(2:34|87)(2:35|86)|36|18)|85|37|58|(1:60)(1:61)|62|83|63|64|66|(3:70|(1:72)|88)|73|(2:75|(2:77|78)(2:79|80))(2:81|82))(1:38))(3:39|(3:42|(4:93|56|99|98)(4:97|49|(3:94|51|102)(3:89|52|(3:96|54|101)(3:95|55|100))|98)|40)|90)|57|58|(0)(0)|62|83|63|64|66|(4:68|70|(0)|88)|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02b7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036a A[LOOP:1: B:71:0x0368->B:72:0x036a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0398  */
    /* JADX WARN: Type inference failed for: r2v74, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lnl(defpackage.pnx r30, int r31, android.graphics.Rect r32, java.lang.String r33, android.graphics.Rect r34) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnl.<init>(pnx, int, android.graphics.Rect, java.lang.String, android.graphics.Rect):void");
    }

    public lnl(String str, long j, long j2, long j3, int i, float f, float f2, int i2, int i3, int i4, int i5, long j4, Rect rect, float f3, lno[] lnoVarArr, lno[] lnoVarArr2, int i6, Rect rect2, boolean z2, int i7, int i8) {
        this.a = null;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.h = f;
        this.i = f2;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = j4;
        this.p = rect;
        this.q = f3;
        this.r = lnoVarArr;
        this.s = lnoVarArr2;
        this.u = i6;
        this.v = rect2;
        this.t = z2;
        this.g = 100;
        this.w = i7;
        this.x = i8;
        this.B = -1;
        this.C = -1;
        this.D = false;
        this.E = false;
        this.F = 0.0f;
        this.G = (byte) 0;
        this.H = A;
        this.y = new HashMap();
        this.j = -1.0f;
    }
}
