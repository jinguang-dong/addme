package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byc extends cnn {
    public static final yo a;
    public final ys A;
    public final ym B;
    public final ym C;
    public final yq D;
    public final ym E;
    public byz F;
    public final got G;
    private final long J;
    private final bxz K;
    private final yf L;
    private final uqm M;
    private yq N;
    private final uiq O;
    public final bxv b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public int j;
    public cpt k;
    public cpt l;
    public boolean m;
    public final aab n;
    public final aab o;
    public int p;
    public Integer q;
    public boolean r;
    public bya s;
    public final String t;
    public final String u;
    public boolean v;
    public final Runnable w;
    public final List x;
    public final yq y;
    public final yq z;
    public int c = Integer.MIN_VALUE;
    private final uiq I = new aal(this, 13);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        yo yoVar = yp.a;
        yo yoVar2 = new yo(32);
        int i = yoVar2.b;
        if (i < 0) {
            a.bn("");
        }
        yoVar2.e(yoVar2.b + 32);
        int[] iArr2 = yoVar2.a;
        int i2 = yoVar2.b;
        if (i != i2) {
            rnt.aw(iArr2, iArr2, i + 32, i, i2);
        }
        rnt.aB(iArr, iArr2, i, 0, 12);
        yoVar2.b += 32;
        a = yoVar2;
    }

    public static final boolean D(cbl cblVar, float f) {
        if (f >= 0.0f || ((Number) cblVar.a.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) cblVar.a.a()).floatValue() < ((Number) cblVar.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean E(cbl cblVar) {
        uif uifVar = cblVar.a;
        if (((Number) uifVar.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) uifVar.a()).floatValue();
        ((Number) cblVar.b.a()).floatValue();
        return false;
    }

    public static final boolean F(cbl cblVar) {
        uif uifVar = cblVar.a;
        if (((Number) uifVar.a()).floatValue() < ((Number) cblVar.b.a()).floatValue()) {
            return true;
        }
        ((Number) uifVar.a()).floatValue();
        return false;
    }

    static /* synthetic */ void H(byc bycVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        bycVar.J(i, i2, num, null);
    }

    public static final ccm I(cbn cbnVar) {
        return (ccm) clc.ad(cbnVar, cbu.C);
    }

    public static final CharSequence K(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        charSequenceSubSequence.getClass();
        return charSequenceSubSequence;
    }

    public static final String L(cbr cbrVar) {
        List list;
        ccm ccmVarI;
        if (cbrVar != null) {
            cbn cbnVar = cbrVar.c;
            cbz cbzVar = cbu.a;
            if (cbnVar.f(cbzVar)) {
                return cij.c((List) cbnVar.b(cbzVar), ",", null, 62);
            }
            if (!cbnVar.f(cbu.C) ? !((list = (List) clc.ad(cbnVar, cbu.y)) == null || (ccmVarI = (ccm) ske.bD(list)) == null) : (ccmVarI = I(cbnVar)) != null) {
                return ccmVarI.b;
            }
        }
        return null;
    }

    private final blh Q(blp blpVar, cbr cbrVar) {
        return blpVar.a(chp.G(cbrVar.b()), cbrVar.b.p, this.b.c());
    }

    private static final Rect R(bkg bkgVar) {
        float f = bkgVar.e;
        float f2 = bkgVar.d;
        return new Rect((int) bkgVar.b, (int) bkgVar.c, (int) f2, (int) f);
    }

    private static final float[] S(blh blhVar) {
        if (!(blhVar instanceof blg)) {
            return null;
        }
        bkh bkhVar = ((blg) blhVar).a;
        long j = bkhVar.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = bkhVar.f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = bkhVar.g;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = bkhVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4))};
    }

    private static final Rect T(blh blhVar) {
        if ((blhVar instanceof blf) || (blhVar instanceof blg)) {
            return R(blhVar.a());
        }
        return null;
    }

    private static final Region U(blh blhVar) {
        if (!(blhVar instanceof ble)) {
            return null;
        }
        ble bleVar = (ble) blhVar;
        Region region = new Region(R(bleVar.a()));
        Region region2 = new Region();
        region2.setPath(bleVar.a.a, region);
        return region2;
    }

    public static final float j(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public final boolean A() {
        return this.d.isEnabled() && !this.g.isEmpty();
    }

    public final boolean B() {
        if (a.ao(null, true)) {
            return true;
        }
        if (a.ao(null, false)) {
            return false;
        }
        return this.d.isRequestFromAccessibilityTool();
    }

    public final boolean C() {
        AccessibilityManager accessibilityManager = this.d;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final boolean G(cbr cbrVar, int i, int i2, boolean z) {
        String strL;
        cbn cbnVar = cbrVar.c;
        cbz cbzVar = cbm.i;
        if (cbnVar.f(cbzVar) && bad.u(cbrVar)) {
            uiv uivVar = (uiv) ((cbc) cbnVar.b(cbzVar)).b;
            if (uivVar != null) {
                return ((Boolean) uivVar.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.p) && (strL = L(cbrVar)) != null) {
            if (i < 0 || i != i2 || i2 > strL.length()) {
                i = -1;
            }
            this.p = i;
            boolean z2 = strL.length() > 0;
            int i3 = cbrVar.e;
            M(o(m(i3), z2 ? Integer.valueOf(this.p) : null, z2 ? Integer.valueOf(this.p) : null, z2 ? Integer.valueOf(strL.length()) : null, strL));
            w(i3);
            return true;
        }
        return false;
    }

    public final void J(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !A()) {
            return;
        }
        AccessibilityEvent accessibilityEventN = n(i, i2);
        if (num != null) {
            accessibilityEventN.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventN.setContentDescription(cij.c(list, ",", null, 62));
        }
        M(accessibilityEventN);
    }

    public final void M(AccessibilityEvent accessibilityEvent) {
        if (A()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.m = true;
            }
            try {
                ((Boolean) this.I.a(accessibilityEvent)).booleanValue();
            } finally {
                this.m = false;
            }
        }
    }

    public final void N(cbr cbrVar, byz byzVar) {
        int[] iArr = yt.a;
        ys ysVar = new ys((byte[]) null);
        List listJ = cbrVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cbr cbrVar2 = (cbr) listJ.get(i);
            yq yqVarP = p();
            int i2 = cbrVar2.e;
            if (yqVarP.b(i2)) {
                if (!((ys) byzVar.b).a(i2)) {
                    t(cbrVar.b);
                    return;
                }
                ysVar.d(i2);
            }
        }
        ys ysVar2 = (ys) byzVar.b;
        int[] iArr2 = ysVar2.b;
        long[] jArr = ysVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((255 & j) < 128 && !ysVar.a(iArr2[(i3 << 3) + i5])) {
                            t(cbrVar.b);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                } else if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List listJ2 = cbrVar.j();
        int size2 = listJ2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            cbr cbrVar3 = (cbr) listJ2.get(i7);
            yq yqVarP2 = p();
            int i8 = cbrVar3.e;
            if (yqVarP2.b(i8)) {
                Object objA = this.D.a(i8);
                objA.getClass();
                N(cbrVar3, (byz) objA);
            }
        }
    }

    public final Rect O(ebn ebnVar) {
        chz chzVar = (chz) ebnVar.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(chzVar.b);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(chzVar.c);
        int i = chzVar.d;
        bxv bxvVar = this.b;
        long jA = bxvVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
        long jA2 = bxvVar.a((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(chzVar.e) & 4294967295L));
        int i2 = (int) (jA2 >> 32);
        int i3 = (int) (jA >> 32);
        int i4 = (int) (jA2 & 4294967295L);
        int i5 = (int) (jA & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))));
    }

    @Override // defpackage.cnn
    public final cpw a(View view) {
        return this.K;
    }

    public final int k(cbr cbrVar) {
        cbn cbnVar = cbrVar.c;
        if (!cbnVar.f(cbu.a)) {
            cbz cbzVar = cbu.D;
            if (cbnVar.f(cbzVar)) {
                return cdn.a(0L);
            }
        }
        return this.p;
    }

    public final int l(cbr cbrVar) {
        cbn cbnVar = cbrVar.c;
        if (!cbnVar.f(cbu.a)) {
            cbz cbzVar = cbu.D;
            if (cbnVar.f(cbzVar)) {
                return cdn.b(0L);
            }
        }
        return this.p;
    }

    public final int m(int i) {
        if (i == this.b.J.c().e) {
            return -1;
        }
        return i;
    }

    public final AccessibilityEvent n(int i, int i2) {
        ebn ebnVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        bxv bxvVar = this.b;
        accessibilityEventObtain.setPackageName(bxvVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(bxvVar, i);
        if (A() && (ebnVar = (ebn) p().a(i)) != null) {
            Object obj = ebnVar.a;
            cbz cbzVar = cbu.G;
            cbn cbnVar = ((cbr) obj).c;
            accessibilityEventObtain.setPassword(cbnVar.f(cbzVar));
            accessibilityEventObtain.setAccessibilityDataSensitive(a.ao(clc.ad(cbnVar, cbu.n), true));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent o(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventN = n(i, 8192);
        if (num != null) {
            accessibilityEventN.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventN.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventN.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventN.getText().add(charSequence);
        }
        return accessibilityEventN;
    }

    public final yq p() {
        if (this.r) {
            this.r = false;
            bxv bxvVar = this.b;
            this.N = cbs.c(bxvVar.J);
            if (A()) {
                yq yqVar = this.N;
                ym ymVar = this.B;
                ym ymVar2 = this.C;
                Resources resources = bxvVar.getContext().getResources();
                ymVar.b();
                ymVar2.b();
                ebn ebnVar = (ebn) yqVar.a(-1);
                Object obj = ebnVar != null ? ebnVar.a : null;
                obj.getClass();
                List listA = ccc.a((cbr) obj, new aaw(yqVar, 15), new aaw(resources, 16), ske.bj(obj));
                int iBk = ske.bk(listA);
                if (iBk > 0) {
                    int i = 1;
                    while (true) {
                        int i2 = ((cbr) listA.get(i - 1)).e;
                        int i3 = ((cbr) listA.get(i)).e;
                        ymVar.c(i2, i3);
                        ymVar2.c(i3, i2);
                        if (i == iBk) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.N;
    }

    public final cpt q() {
        if (this.d.isEnabled()) {
            return null;
        }
        return cpt.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005b, B:27:0x0063, B:29:0x006c, B:31:0x0074, B:33:0x0080, B:35:0x008e, B:40:0x00a2, B:43:0x00a9, B:45:0x00ad, B:49:0x00b8, B:51:0x00c0, B:38:0x009a, B:52:0x00cd, B:66:0x0145, B:55:0x00d4, B:57:0x00e2, B:60:0x00f8, B:62:0x0100, B:64:0x0122, B:65:0x0142, B:67:0x0149, B:69:0x0151, B:70:0x016f, B:72:0x0176, B:73:0x017f, B:18:0x003a, B:21:0x0041), top: B:82:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x019a -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.uhb r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byc.r(uhb):java.lang.Object");
    }

    public final void t(bvm bvmVar) {
        if (this.L.add(bvmVar)) {
            this.M.j(ufg.a);
        }
    }

    public final void u(bzw bzwVar) {
        if (bzwVar.dn()) {
            bxv bxvVar = this.b;
            bxvVar.t.d(bzwVar, this.O, new bpj(bzwVar, this, 6));
        }
    }

    public final void v(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventN = n(m(i), 32);
        accessibilityEventN.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventN.getText().add(str);
        }
        M(accessibilityEventN);
    }

    public final void w(int i) {
        bya byaVar = this.s;
        if (byaVar != null) {
            cbr cbrVar = byaVar.a;
            int i2 = cbrVar.e;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - byaVar.f <= 1000) {
                AccessibilityEvent accessibilityEventN = n(m(i2), 131072);
                accessibilityEventN.setFromIndex(byaVar.d);
                accessibilityEventN.setToIndex(byaVar.e);
                accessibilityEventN.setAction(byaVar.b);
                accessibilityEventN.setMovementGranularity(byaVar.c);
                accessibilityEventN.getText().add(L(cbrVar));
                M(accessibilityEventN);
            }
        }
        this.s = null;
    }

    public final void x(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        H(this, i, 128, null, 12);
        H(this, i2, 256, null, 12);
    }

    public final boolean y(boolean z, int i, long j) {
        long[] jArr;
        int i2;
        int i3;
        long[] jArr2;
        int i4;
        boolean z2;
        long j2;
        char c;
        cbl cblVar;
        int i5 = 0;
        if (!a.ao(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        yq yqVarP = p();
        if (!a.q(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            cbz cbzVar = z ? cbu.u : cbu.t;
            Object[] objArr = yqVarP.c;
            long[] jArr3 = yqVarP.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return false;
            }
            int i6 = 0;
            boolean z3 = false;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i6 - length;
                    int i8 = i5;
                    while (true) {
                        i3 = 8 - ((~i7) >>> 31);
                        if (i8 >= i3) {
                            break;
                        }
                        if ((j3 & 255) < 128) {
                            ebn ebnVar = (ebn) objArr[(i6 << 3) + i8];
                            i4 = i5;
                            chz chzVar = (chz) ebnVar.b;
                            c = '\b';
                            bkg bkgVar = new bkg(chzVar.b, chzVar.c, chzVar.d, chzVar.e);
                            z2 = z3;
                            j2 = j3;
                            float f = bkgVar.b;
                            float f2 = bkgVar.d;
                            jArr2 = jArr3;
                            float f3 = bkgVar.c;
                            float f4 = bkgVar.e;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                            if (((fIntBitsToFloat >= f ? 1 : i4) & (fIntBitsToFloat < f2 ? 1 : i4) & (fIntBitsToFloat2 >= f3 ? 1 : i4) & (fIntBitsToFloat2 < f4 ? 1 : i4)) != 0 && (cblVar = (cbl) clc.ad(((cbr) ebnVar.a).c, cbzVar)) != null && (i >= 0 ? ((Number) cblVar.a.a()).floatValue() < ((Number) cblVar.b.a()).floatValue() : ((Number) cblVar.a.a()).floatValue() > 0.0f)) {
                                z3 = true;
                            }
                            j3 = j2 >> c;
                            i8++;
                            i5 = i4;
                            jArr3 = jArr2;
                        } else {
                            jArr2 = jArr3;
                            i4 = i5;
                            z2 = z3;
                            j2 = j3;
                            c = '\b';
                        }
                        z3 = z2;
                        j3 = j2 >> c;
                        i8++;
                        i5 = i4;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    i2 = i5;
                    boolean z4 = z3;
                    if (i3 != 8) {
                        return z4;
                    }
                    z3 = z4;
                } else {
                    jArr = jArr3;
                    i2 = i5;
                }
                if (i6 == length) {
                    return z3;
                }
                i6++;
                i5 = i2;
                jArr3 = jArr;
            }
        }
        return false;
    }

    public final boolean z(int i) {
        return this.i == i;
    }

    public final void s(int i, cpt cptVar, String str, Bundle bundle) {
        Object obj;
        blp blpVar;
        Region regionU;
        float[] fArrS;
        Rect rectT;
        cdl cdlVar;
        RectF rectF;
        ebn ebnVar = (ebn) p().a(i);
        if (ebnVar == null || (obj = ebnVar.a) == null) {
            return;
        }
        String str2 = this.t;
        cbr cbrVar = (cbr) obj;
        String strL = L(cbrVar);
        if (a.ao(str, str2)) {
            int iD = this.B.d(i);
            if (iD != -1) {
                cptVar.a().putInt(str, iD);
                return;
            }
            return;
        }
        if (a.ao(str, this.u)) {
            int iD2 = this.C.d(i);
            if (iD2 != -1) {
                cptVar.a().putInt(str, iD2);
                return;
            }
            return;
        }
        cbn cbnVar = cbrVar.c;
        if (cbnVar.f(cbm.a) && bundle != null && a.ao(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt(ibINv.ArJmayJ, -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strL != null ? strL.length() : Integer.MAX_VALUE)) {
                    cdl cdlVarZ = blb.z(cbnVar);
                    if (cdlVarZ != null) {
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        while (i4 < i3) {
                            int i5 = i2 + i4;
                            if (i5 >= cdlVarZ.a.a.a()) {
                                arrayList.add(null);
                                cdlVar = cdlVarZ;
                            } else {
                                bkg bkgVarE = cdlVarZ.f(i5).e(cbrVar.a());
                                bkg bkgVarC = cbrVar.c();
                                float f = bkgVarE.b;
                                float f2 = bkgVarC.d;
                                cdlVar = cdlVarZ;
                                bkg bkgVarC2 = ((bkgVarC.c > bkgVarE.e ? 1 : (bkgVarC.c == bkgVarE.e ? 0 : -1)) < 0) & (((bkgVarE.c > bkgVarC.e ? 1 : (bkgVarE.c == bkgVarC.e ? 0 : -1)) < 0) & (((bkgVarC.b > bkgVarE.d ? 1 : (bkgVarC.b == bkgVarE.d ? 0 : -1)) < 0) & ((f > f2 ? 1 : (f == f2 ? 0 : -1)) < 0))) ? bkgVarE.c(bkgVarC) : null;
                                if (bkgVarC2 != null) {
                                    bxv bxvVar = this.b;
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(bkgVarC2.b);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(bkgVarC2.c);
                                    float f3 = bkgVarC2.d;
                                    long jA = bxvVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                                    long jA2 = bxvVar.a((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(bkgVarC2.e) & 4294967295L));
                                    int i6 = (int) (jA2 >> 32);
                                    int i7 = (int) (jA >> 32);
                                    int i8 = (int) (jA2 & 4294967295L);
                                    int i9 = (int) (jA & 4294967295L);
                                    rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i6)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i6)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i8)));
                                } else {
                                    rectF = null;
                                }
                                arrayList.add(rectF);
                            }
                            i4++;
                            cdlVarZ = cdlVar;
                        }
                        cptVar.a().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        cbz cbzVar = cbu.w;
        if (cbnVar.f(cbzVar) && bundle != null && a.ao(str, "androidx.compose.ui.semantics.testTag")) {
            String str3 = (String) clc.ad(cbnVar, cbzVar);
            if (str3 != null) {
                cptVar.a().putCharSequence(str, str3);
                return;
            }
            return;
        }
        if (a.ao(str, "androidx.compose.ui.semantics.id")) {
            cptVar.a().putInt(str, cbrVar.e);
            return;
        }
        if (a.ao(str, "androidx.compose.ui.semantics.shapeType")) {
            blp blpVar2 = (blp) clc.ad(cbnVar, cbu.L);
            if (blpVar2 != null) {
                blh blhVarQ = Q(blpVar2, cbrVar);
                if (blhVarQ instanceof blf) {
                    cptVar.a().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    cptVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", T(blhVarQ));
                    return;
                } else if (blhVarQ instanceof blg) {
                    cptVar.a().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    cptVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", T(blhVarQ));
                    cptVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", S(blhVarQ));
                    return;
                } else {
                    if (!(blhVarQ instanceof ble)) {
                        throw new uet();
                    }
                    cptVar.a().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    cptVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", U(blhVarQ));
                    return;
                }
            }
            return;
        }
        if (a.ao(str, "androidx.compose.ui.semantics.shapeRect")) {
            blp blpVar3 = (blp) clc.ad(cbnVar, cbu.L);
            if (blpVar3 == null || (rectT = T(Q(blpVar3, cbrVar))) == null) {
                return;
            }
            cptVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", rectT);
            return;
        }
        if (a.ao(str, "androidx.compose.ui.semantics.shapeCorners")) {
            blp blpVar4 = (blp) clc.ad(cbnVar, cbu.L);
            if (blpVar4 == null || (fArrS = S(Q(blpVar4, cbrVar))) == null) {
                return;
            }
            cptVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrS);
            return;
        }
        if (!a.ao(str, "androidx.compose.ui.semantics.shapeRegion") || (blpVar = (blp) clc.ad(cbnVar, cbu.L)) == null || (regionU = U(Q(blpVar, cbrVar))) == null) {
            return;
        }
        cptVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionU);
    }

    public byc(bxv bxvVar) {
        this.b = bxvVar;
        Object systemService = bxvVar.getContext().getSystemService(CGlJpiVWrCQOq.OHrSgSpUL);
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.J = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: bxw
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                byc bycVar = this.a;
                bycVar.g = z ? bycVar.d.getEnabledAccessibilityServiceList(-1) : ufw.a;
            }
        };
        this.f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: bxx
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                byc bycVar = this.a;
                bycVar.g = bycVar.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.K = new bxz(this);
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.y = new yq((byte[]) null);
        this.z = new yq((byte[]) null);
        this.n = new aab(null);
        this.o = new aab(null);
        this.p = -1;
        this.L = new yf(null);
        this.M = ukc.P(1, 0, null, 6);
        this.r = true;
        this.N = yr.a();
        this.A = new ys((byte[]) null);
        this.B = new ym((byte[]) null);
        this.C = new ym((byte[]) null);
        this.t = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.u = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new got((char[]) null);
        this.D = new yq((byte[]) null);
        this.F = new byz(bxvVar.J.c(), yr.a());
        int i = yn.a;
        this.E = new ym((byte[]) null);
        bxvVar.addOnAttachStateChangeListener(new bzz(this, 1));
        this.w = new Runnable() { // from class: bxy
            /* JADX WARN: Code restructure failed: missing block: B:280:0x07b6, code lost:
            
                r30 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:281:0x07c0, code lost:
            
                if (((r1 & ((~r1) << 6)) & (-9187201950435737472L)) == 0) goto L285;
             */
            /* JADX WARN: Code restructure failed: missing block: B:282:0x07c2, code lost:
            
                r11 = -1;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:204:0x0517  */
            /* JADX WARN: Removed duplicated region for block: B:261:0x071a  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0143 A[Catch: all -> 0x08a8, Merged into TryCatch #0 {all -> 0x08b2, all -> 0x08a3, all -> 0x08a8, all -> 0x08ad, blocks: (B:5:0x0016, B:9:0x002e, B:237:0x0699, B:318:0x0899, B:322:0x08a4, B:323:0x08a7, B:325:0x08a9, B:326:0x08ac, B:328:0x08ae, B:329:0x08b1, B:238:0x06a1, B:241:0x06b4, B:243:0x06c0, B:245:0x06cb, B:247:0x06d1, B:249:0x06e2, B:252:0x06e8, B:254:0x06f4, B:256:0x0701, B:258:0x070f, B:259:0x0714, B:262:0x071c, B:263:0x071f, B:266:0x072b, B:268:0x0737, B:270:0x0742, B:272:0x0748, B:273:0x075d, B:276:0x079c, B:284:0x07c5, B:287:0x07e0, B:279:0x07ad, B:280:0x07b6, B:285:0x07c9, B:293:0x07fa, B:294:0x0804, B:297:0x081b, B:299:0x0827, B:301:0x0834, B:303:0x083a, B:305:0x0852, B:307:0x0858, B:309:0x0866, B:310:0x0874, B:316:0x0883, B:317:0x0886, B:10:0x0036, B:13:0x005b, B:15:0x006b, B:17:0x0078, B:19:0x007e, B:22:0x008f, B:24:0x009b, B:27:0x00a1, B:30:0x00c3, B:32:0x00d3, B:34:0x00e0, B:36:0x00e6, B:38:0x00fb, B:42:0x0108, B:46:0x0118, B:51:0x013b, B:53:0x0143, B:55:0x0152, B:209:0x0580, B:58:0x016b, B:60:0x0175, B:63:0x017f, B:65:0x0187, B:66:0x01a2, B:68:0x01ad, B:92:0x024b, B:71:0x01bc, B:73:0x01c4, B:75:0x01d2, B:79:0x01f6, B:81:0x01ff, B:83:0x020d, B:86:0x021d, B:88:0x0222, B:89:0x0229, B:90:0x022d, B:93:0x026f, B:95:0x027e, B:97:0x029f, B:100:0x02a9, B:102:0x02b1, B:105:0x02be, B:108:0x02c6, B:110:0x02e0, B:116:0x02fc, B:118:0x0300, B:123:0x0319, B:137:0x0352, B:139:0x03a1, B:142:0x03ad, B:138:0x037f, B:121:0x0314, B:113:0x02ef, B:143:0x03c8, B:144:0x03e5, B:146:0x03fa, B:148:0x0400, B:152:0x0407, B:153:0x043f, B:155:0x0445, B:158:0x044f, B:160:0x0457, B:162:0x0462, B:163:0x0473, B:164:0x0488, B:166:0x0490, B:168:0x04a2, B:170:0x04ad, B:172:0x04b8, B:174:0x04be, B:178:0x04c9, B:179:0x04d1, B:180:0x04d2, B:181:0x04da, B:182:0x04db, B:185:0x04e2, B:187:0x04e6, B:190:0x04f6, B:193:0x04fb, B:196:0x0508, B:198:0x050c, B:202:0x0513, B:205:0x051b, B:206:0x0541, B:45:0x0111, B:48:0x011d, B:215:0x05bf, B:219:0x05f1, B:220:0x05f9, B:222:0x05ff, B:224:0x0619, B:225:0x0628, B:226:0x0632, B:6:0x001b, B:8:0x0021), top: B:336:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x016b A[Catch: all -> 0x08a8, Merged into TryCatch #0 {all -> 0x08b2, all -> 0x08a3, all -> 0x08a8, all -> 0x08ad, blocks: (B:5:0x0016, B:9:0x002e, B:237:0x0699, B:318:0x0899, B:322:0x08a4, B:323:0x08a7, B:325:0x08a9, B:326:0x08ac, B:328:0x08ae, B:329:0x08b1, B:238:0x06a1, B:241:0x06b4, B:243:0x06c0, B:245:0x06cb, B:247:0x06d1, B:249:0x06e2, B:252:0x06e8, B:254:0x06f4, B:256:0x0701, B:258:0x070f, B:259:0x0714, B:262:0x071c, B:263:0x071f, B:266:0x072b, B:268:0x0737, B:270:0x0742, B:272:0x0748, B:273:0x075d, B:276:0x079c, B:284:0x07c5, B:287:0x07e0, B:279:0x07ad, B:280:0x07b6, B:285:0x07c9, B:293:0x07fa, B:294:0x0804, B:297:0x081b, B:299:0x0827, B:301:0x0834, B:303:0x083a, B:305:0x0852, B:307:0x0858, B:309:0x0866, B:310:0x0874, B:316:0x0883, B:317:0x0886, B:10:0x0036, B:13:0x005b, B:15:0x006b, B:17:0x0078, B:19:0x007e, B:22:0x008f, B:24:0x009b, B:27:0x00a1, B:30:0x00c3, B:32:0x00d3, B:34:0x00e0, B:36:0x00e6, B:38:0x00fb, B:42:0x0108, B:46:0x0118, B:51:0x013b, B:53:0x0143, B:55:0x0152, B:209:0x0580, B:58:0x016b, B:60:0x0175, B:63:0x017f, B:65:0x0187, B:66:0x01a2, B:68:0x01ad, B:92:0x024b, B:71:0x01bc, B:73:0x01c4, B:75:0x01d2, B:79:0x01f6, B:81:0x01ff, B:83:0x020d, B:86:0x021d, B:88:0x0222, B:89:0x0229, B:90:0x022d, B:93:0x026f, B:95:0x027e, B:97:0x029f, B:100:0x02a9, B:102:0x02b1, B:105:0x02be, B:108:0x02c6, B:110:0x02e0, B:116:0x02fc, B:118:0x0300, B:123:0x0319, B:137:0x0352, B:139:0x03a1, B:142:0x03ad, B:138:0x037f, B:121:0x0314, B:113:0x02ef, B:143:0x03c8, B:144:0x03e5, B:146:0x03fa, B:148:0x0400, B:152:0x0407, B:153:0x043f, B:155:0x0445, B:158:0x044f, B:160:0x0457, B:162:0x0462, B:163:0x0473, B:164:0x0488, B:166:0x0490, B:168:0x04a2, B:170:0x04ad, B:172:0x04b8, B:174:0x04be, B:178:0x04c9, B:179:0x04d1, B:180:0x04d2, B:181:0x04da, B:182:0x04db, B:185:0x04e2, B:187:0x04e6, B:190:0x04f6, B:193:0x04fb, B:196:0x0508, B:198:0x050c, B:202:0x0513, B:205:0x051b, B:206:0x0541, B:45:0x0111, B:48:0x011d, B:215:0x05bf, B:219:0x05f1, B:220:0x05f9, B:222:0x05ff, B:224:0x0619, B:225:0x0628, B:226:0x0632, B:6:0x001b, B:8:0x0021), top: B:336:0x0016 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2236
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bxy.run():void");
            }
        };
        this.x = new ArrayList();
        this.O = new aal(this, 14);
    }
}
