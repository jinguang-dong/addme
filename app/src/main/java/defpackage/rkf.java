package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.Window;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkf {
    public rkf() {
        throw null;
    }

    public static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static void b(Window window, boolean z) {
        window.getDecorView();
        com.e(z, new cpq(window, (byte[]) null));
    }

    public static void c(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    public static boolean d(PointF pointF, PointF pointF2) {
        return e(pointF.x, pointF2.x) && e(pointF.y, pointF2.y);
    }

    public static boolean e(float f, float f2) {
        return Math.abs(f - f2) <= 0.0f;
    }

    public static /* synthetic */ void f() {
        try {
            System.loadLibrary("smartcapture_native");
        } catch (UnsatisfiedLinkError e) {
            if ("Dalvik".equals(rws.j.a())) {
                throw e;
            }
        }
    }

    public static FloatBuffer g(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static /* synthetic */ boolean h(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    public static long i(long j, long j2) {
        long j3 = j + j2;
        ske.an(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static long j(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        long j3 = j * j2;
        if (iNumberOfLeadingZeros > 65) {
            return j3;
        }
        ske.an(iNumberOfLeadingZeros >= 64, "checkedMultiply", j, j2);
        ske.an(true, "checkedMultiply", j, j2);
        ske.an(j == 0 || j3 / j == j2, "checkedMultiply", j, j2);
        return j3;
    }

    public static long k(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (svu.a[roundingMode.ordinal()]) {
            case 1:
                ske.ao(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i;
    }

    public static long l(long j, long j2) {
        ske.ap("a", j);
        ske.ap("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long m(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = j ^ j2;
        long j4 = (j3 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j5 = j * j2;
            if (j == 0 || j5 / j == j2) {
                return j5;
            }
        }
        return j4;
    }

    public static boolean n(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static tpc o(Throwable th, boolean z) {
        tpc tpcVarM = sut.a.m();
        tpc tpcVarM2 = suq.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        suq suqVar = (suq) tpcVarM2.b;
        suqVar.b |= 1;
        suqVar.c = "";
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sut sutVar = (sut) tpcVarM.b;
        suq suqVar2 = (suq) tpcVarM2.l();
        suqVar2.getClass();
        sutVar.e = suqVar2;
        sutVar.b |= 1;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(th);
        identityHashMap.put(th, 0);
        arrayList.add(p(th, z));
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.remove();
            Integer num = (Integer) identityHashMap.get(th2);
            num.getClass();
            int iIntValue = num.intValue();
            if (th2.getCause() != null) {
                Throwable cause = th2.getCause();
                if (!identityHashMap.containsKey(cause)) {
                    identityHashMap.put(cause, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(p(cause, z));
                    arrayDeque.add(cause);
                }
                tpc tpcVar = (tpc) arrayList.get(iIntValue);
                int iIntValue2 = ((Integer) identityHashMap.get(cause)).intValue();
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                sus susVar = (sus) tpcVar.b;
                sus susVar2 = sus.a;
                susVar.b |= 2;
                susVar.d = iIntValue2;
            }
            for (Throwable th3 : th2.getSuppressed()) {
                if (!identityHashMap.containsKey(th3)) {
                    identityHashMap.put(th3, Integer.valueOf(identityHashMap.size()));
                    arrayList.add(p(th3, z));
                    arrayDeque.add(th3);
                }
                tpc tpcVar2 = (tpc) arrayList.get(iIntValue);
                int iIntValue3 = ((Integer) identityHashMap.get(th3)).intValue();
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                sus susVar3 = (sus) tpcVar2.b;
                sus susVar4 = sus.a;
                tpn tpnVar = susVar3.e;
                if (!tpnVar.c()) {
                    susVar3.e = tph.t(tpnVar);
                }
                susVar3.e.g(iIntValue3);
            }
        }
        tpc tpcVarM3 = sur.a.m();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tpc tpcVar3 = (tpc) arrayList.get(i);
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            sur surVar = (sur) tpcVarM3.b;
            sus susVar5 = (sus) tpcVar3.l();
            susVar5.getClass();
            surVar.b();
            surVar.b.add(susVar5);
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sut sutVar2 = (sut) tpcVarM.b;
        sur surVar2 = (sur) tpcVarM3.l();
        surVar2.getClass();
        sutVar2.d = surVar2;
        sutVar2.c = 4;
        return tpcVarM;
    }

    public static tpc p(Throwable th, boolean z) {
        tpc tpcVarM = sus.a.m();
        tpc tpcVarW = w(th, z);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sus susVar = (sus) tpcVarM.b;
        suq suqVar = (suq) tpcVarW.l();
        suqVar.getClass();
        susVar.c = suqVar;
        susVar.b |= 1;
        return tpcVarM;
    }

    public static tpc q(Throwable th) {
        tpc tpcVarM = sut.a.m();
        tpc tpcVarW = w(th, false);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sut sutVar = (sut) tpcVarM.b;
        suq suqVar = (suq) tpcVarW.l();
        suqVar.getClass();
        sutVar.e = suqVar;
        sutVar.b |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return tpcVarM;
            }
            tpc tpcVarW2 = w(th, false);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sut sutVar2 = (sut) tpcVarM.b;
            suq suqVar2 = (suq) tpcVarW2.l();
            suqVar2.getClass();
            sutVar2.b();
            sutVar2.f.add(suqVar2);
        }
    }

    public static int r(int i) {
        return i - 2;
    }

    public static int s(int i) {
        return i - 2;
    }

    public static int t(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int u(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 200) {
            return 202;
        }
        if (i == 4000) {
            return 4002;
        }
        switch (i) {
            case 100:
                return 102;
            case 101:
                return 103;
            case 102:
                return 104;
            case 103:
                return 105;
            case 104:
                return 106;
            case 105:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return ScriptIntrinsicBLAS.NO_TRANSPOSE;
            case 110:
                return ScriptIntrinsicBLAS.TRANSPOSE;
            case ScriptIntrinsicBLAS.NO_TRANSPOSE /* 111 */:
                return ScriptIntrinsicBLAS.CONJ_TRANSPOSE;
            default:
                switch (i) {
                    case 300:
                        return 302;
                    case 301:
                        return 303;
                    case 302:
                        return 304;
                    case 303:
                        return 305;
                    case 304:
                        return 306;
                    case 305:
                        return 307;
                    case 306:
                        return 308;
                    case 307:
                        return 309;
                    case 308:
                        return 310;
                    case 309:
                        return 311;
                    case 310:
                        return 312;
                    case 311:
                        return 313;
                    case 312:
                        return 314;
                    case 313:
                        return 315;
                    case 314:
                        return 316;
                    case 315:
                        return 317;
                    case 316:
                        return 318;
                    case 317:
                        return 319;
                    case 318:
                        return 320;
                    case 319:
                        return 321;
                    case 320:
                        return 322;
                    case 321:
                        return 323;
                    case 322:
                        return 324;
                    case 323:
                        return 325;
                    case 324:
                        return 326;
                    case 325:
                        return 327;
                    case 326:
                        return 328;
                    case 327:
                        return 329;
                    case 328:
                        return 330;
                    case 329:
                        return 331;
                    case 330:
                        return 332;
                    case 331:
                        return 333;
                    default:
                        switch (i) {
                            case 400:
                                return 402;
                            case 401:
                                return 403;
                            case 402:
                                return 404;
                            case 403:
                                return 405;
                            case 404:
                                return 406;
                            default:
                                switch (i) {
                                    case 500:
                                        return 502;
                                    case 501:
                                        return 503;
                                    case 502:
                                        return 504;
                                    case 503:
                                        return 505;
                                    case 504:
                                        return 506;
                                    case 505:
                                        return 507;
                                    case 506:
                                        return 508;
                                    default:
                                        switch (i) {
                                            case 1000:
                                                return 1002;
                                            case 1001:
                                                return 1003;
                                            case 1002:
                                                return 1004;
                                            case 1003:
                                                return 1005;
                                            case 1004:
                                                return 1006;
                                            case 1005:
                                                return 1007;
                                            case 1006:
                                                return 1008;
                                            case 1007:
                                                return 1009;
                                            case 1008:
                                                return 1010;
                                            case 1009:
                                                return 1011;
                                            case 1010:
                                                return 1012;
                                            case 1011:
                                                return 1013;
                                            default:
                                                switch (i) {
                                                    case 2000:
                                                        return 2002;
                                                    case 2001:
                                                        return 2003;
                                                    case 2002:
                                                        return 2004;
                                                    case 2003:
                                                        return 2005;
                                                    case 2004:
                                                        return 2006;
                                                    case 2005:
                                                        return 2007;
                                                    case 2006:
                                                        return 2008;
                                                    case 2007:
                                                        return 2009;
                                                    case 2008:
                                                        return 2010;
                                                    case 2009:
                                                        return 2011;
                                                    case 2010:
                                                        return 2012;
                                                    case 2011:
                                                        return 2013;
                                                    case 2012:
                                                        return 2014;
                                                    case 2013:
                                                        return 2015;
                                                    case 2014:
                                                        return 2016;
                                                    default:
                                                        switch (i) {
                                                            case 3000:
                                                                return 3002;
                                                            case 3001:
                                                                return 3003;
                                                            case 3002:
                                                                return 3004;
                                                            case 3003:
                                                                return 3005;
                                                            case 3004:
                                                                return 3006;
                                                            default:
                                                                switch (i) {
                                                                    case 4100:
                                                                        return 4102;
                                                                    case 4101:
                                                                        return 4103;
                                                                    case 4102:
                                                                        return 4104;
                                                                    case 4103:
                                                                        return 4105;
                                                                    case 4104:
                                                                        return 4106;
                                                                    case 4105:
                                                                        return 4107;
                                                                    case 4106:
                                                                        return 4108;
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int v(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static tpc w(Throwable th, boolean z) {
        StackTraceElement[] stackTrace;
        tpc tpcVarM = suq.a.m();
        String name = th.getClass().getName();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        suq suqVar = (suq) tpcVarM.b;
        name.getClass();
        suqVar.b |= 1;
        suqVar.c = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suq suqVar2 = (suq) tpcVarM.b;
            message.getClass();
            suqVar2.b |= 2;
            suqVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                tpc tpcVarM2 = sup.a.m();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sup supVar = (sup) tpcVarM2.b;
                    className.getClass();
                    supVar.b |= 1;
                    supVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sup supVar2 = (sup) tpcVarM2.b;
                    methodName.getClass();
                    supVar2.b |= 2;
                    supVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    sup supVar3 = (sup) tpcVarM2.b;
                    supVar3.b |= 8;
                    supVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        sup supVar4 = (sup) tpcVarM2.b;
                        fileName.getClass();
                        supVar4.b |= 4;
                        supVar4.e = fileName;
                    }
                }
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                suq suqVar3 = (suq) tpcVarM.b;
                sup supVar5 = (sup) tpcVarM2.l();
                supVar5.getClass();
                tpw tpwVar = suqVar3.f;
                if (!tpwVar.c()) {
                    suqVar3.f = tph.v(tpwVar);
                }
                suqVar3.f.add(supVar5);
            }
        }
        return tpcVarM;
    }

    public rkf(byte[] bArr) {
    }
}
