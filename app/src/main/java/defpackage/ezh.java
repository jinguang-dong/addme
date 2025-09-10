package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.PlaybackStatus;
import com.google.ar.core.Point;
import com.google.ar.core.R;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.DeadlineExceededException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.NotTrackingException;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.SessionPausedException;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.util.Collection;
import j$.util.Optional;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ezh {
    public ezh() {
    }

    public static void A(Context context, Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    public static int B(gpa gpaVar, int i, int i2) {
        int i3 = gpaVar.c;
        if (i3 > i2) {
            return 4;
        }
        if (i3 != 0) {
            return i3 % (i + 1) == 0 ? 3 : 5;
        }
        int i4 = gpaVar.b;
        return (i4 == 0 || i4 % (i + 1) != 0) ? 5 : 3;
    }

    public static String C(gaw gawVar, gho ghoVar, float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(gawVar.d.name());
        sb.append("/");
        sb.append(gawVar.c.name());
        sb.append(" FACING=".concat(String.valueOf(gawVar.B.name())));
        if (ghoVar != null) {
            sb.append(" STAB=".concat(String.valueOf(ghoVar.name())));
        }
        sb.append(" ZOOM=" + f);
        return sb.toString();
    }

    public static boolean D(oxh oxhVar) {
        oxhVar.getClass();
        return oxhVar.equals(oxh.FPS_30) || oxhVar.equals(oxh.FPS_24);
    }

    public static ltg E(gcc gccVar) {
        rwc rwcVarC = gccVar.c();
        return rwcVarC.h() ? ((lsw) rwcVarC.c()).c : ltg.MEDIA_STORE;
    }

    public static srg G() {
        ocq ocqVarAt = ske.at(srg.a.m());
        ocqVarAt.T(iuh.a.f);
        return ocqVarAt.S();
    }

    public static srg H() {
        ocq ocqVarAt = ske.at(srg.a.m());
        ocqVarAt.T(iuh.c.f);
        return ocqVarAt.S();
    }

    public static Optional I(sbp sbpVar) {
        Optional optionalFindFirst = Collection.EL.stream(sbpVar).filter(new hzk(8)).findFirst();
        return optionalFindFirst.isPresent() ? ((isf) optionalFindFirst.get()).d : Optional.empty();
    }

    public static int J(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ iof K(tpc tpcVar) {
        tph tphVarI = tpcVar.l();
        tphVarI.getClass();
        return (iof) tphVarI;
    }

    public static void L(int i, tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        iof iofVar = (iof) tpcVar.b;
        iof iofVar2 = iof.a;
        iofVar.c = i;
    }

    public static void M(int i, tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        iof iofVar = (iof) tpcVar.b;
        iof iofVar2 = iof.a;
        iofVar.d = i - 2;
    }

    public static ByteBuffer N(int i, int i2, poi poiVar) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
        qmi.a.copyBytes2D(poiVar.getBuffer(), byteBufferAllocateDirect, i, i2, 0, 0, poiVar.getPixelStride(), 1, poiVar.getRowStride(), i);
        return byteBufferAllocateDirect;
    }

    public static String O(int i, Context context, boolean z) {
        int i2 = i - 1;
        return context.getString(i2 != 2 ? i2 != 3 ? i2 != 4 ? R.string.imax_stopped_too_fast : R.string.imax_stopped_backtracking : R.string.imax_stopped_too_much_roll : true != z ? R.string.imax_stopped_too_much_vertical_tilt : R.string.imax_stopped_too_much_horizontal_tilt);
    }

    public static int P(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 7;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 != 4) {
            return i2 != 5 ? 2 : 6;
        }
        return 5;
    }

    public static ifr Q(Rect rect) {
        tpc tpcVarM = ifr.a.m();
        int i = rect.left;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((ifr) tpcVarM.b).b = i;
        int i2 = rect.top;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((ifr) tpcVarM.b).c = i2;
        int i3 = rect.right;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((ifr) tpcVarM.b).d = i3;
        int i4 = rect.bottom;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((ifr) tpcVarM.b).e = i4;
        return (ifr) tpcVarM.l();
    }

    public static /* synthetic */ String R(int i) {
        return i != 1 ? i != 2 ? "DISABLED" : "THROTTLED" : "ENABLED";
    }

    public static void S(hbj hbjVar, pfg pfgVar) {
        CaptureRequest.Key key = nvj.g;
        if (key == null || !((Boolean) hbjVar.a(gzs.a).map(new gbm(11)).orElse(false)).booleanValue()) {
            return;
        }
        pfgVar.e(key, 2);
    }

    public static int T(hwh hwhVar, ltf ltfVar) {
        return (ltfVar == ltf.SQUAD && hwhVar.c()) ? 3 : 1;
    }

    public static /* synthetic */ String U(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PRIMARY" : "BURST" : "NONE";
    }

    public static /* synthetic */ int V(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static ssm W(RectF rectF) {
        if (rectF == null) {
            return ssm.a;
        }
        tpc tpcVarM = ssm.a.m();
        float f = rectF.left;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ssm ssmVar = (ssm) tpcVarM.b;
        ssmVar.b |= 1;
        ssmVar.c = f;
        float f2 = rectF.top;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ssm ssmVar2 = (ssm) tpcVarM.b;
        ssmVar2.b |= 2;
        ssmVar2.d = f2;
        float f3 = rectF.right;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ssm ssmVar3 = (ssm) tpcVarM.b;
        ssmVar3.b |= 4;
        ssmVar3.e = f3;
        float f4 = rectF.bottom;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ssm ssmVar4 = (ssm) tpcVarM.b;
        ssmVar4.b |= 8;
        ssmVar4.f = f4;
        return (ssm) tpcVarM.l();
    }

    public static boolean X(int i) {
        if (i != 0) {
            return i == 2;
        }
        throw null;
    }

    public static float Y(float f, float f2) {
        return Math.max(0.0f, Math.min(f2, f));
    }

    public static long Z(Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }

    public static boolean a(int i, int i2, int i3) {
        return (i / i3) % 2 == 0 && (i2 / i3) % 2 == 0;
    }

    public static sbp aa(byte[] bArr) {
        try {
            int i = sbp.d;
            sbk sbkVar = new sbk();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.nativeOrder());
            int i2 = byteBufferWrap.getInt();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = byteBufferWrap.getInt();
                int i5 = byteBufferWrap.getInt();
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList.add(Float.valueOf(byteBufferWrap.getFloat()));
                }
                sbp sbpVarJ = sbp.j(sbp.j(arrayList));
                for (int i7 = 0; i7 < 6 - i5; i7++) {
                    byteBufferWrap.getFloat();
                }
                float f = byteBufferWrap.getFloat();
                if (sbpVarJ == null) {
                    throw new IllegalStateException();
                }
                hpy hpyVar = new hpy(i4, sbpVarJ, f);
                a.I(hpyVar.b.size() == 4);
                sbkVar.h(hpyVar);
            }
            return sbkVar.g();
        } catch (BufferUnderflowException unused) {
            int i8 = sbp.d;
            return sex.a;
        }
    }

    public static tto ab(lnl lnlVar, float f, float f2) {
        return ac(lnlVar, null, f, f2);
    }

    public static tto ac(lnl lnlVar, hpr hprVar, float f, float f2) {
        lnl lnlVar2 = lnlVar;
        HashMap map = new HashMap();
        if (hprVar != null) {
            for (hpq hpqVar : hprVar.b) {
                map.put(Long.valueOf(hpqVar.a), Float.valueOf(hpqVar.b));
            }
        }
        ArrayList arrayList = new ArrayList();
        lno[] lnoVarArr = lnlVar2.r;
        int length = lnoVarArr.length;
        int i = 0;
        while (i < length) {
            Map map2 = lnlVar2.y;
            lno lnoVar = lnoVarArr[i];
            int i2 = lnoVar.i;
            hpy hpyVar = (hpy) map2.get(Integer.valueOf(i2));
            long j = i2;
            Float f3 = (Float) map.get(Long.valueOf(j));
            float fFloatValue = f3 == null ? 0.0f : f3.floatValue();
            Rect rect = lnoVar.a;
            tpc tpcVarM = ttl.a.m();
            float f4 = rect.left * f;
            HashMap map3 = map;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ttl ttlVar = (ttl) tpcVarM.b;
            lno[] lnoVarArr2 = lnoVarArr;
            ttlVar.b |= 1;
            ttlVar.c = f4;
            float f5 = rect.right * f;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ttl ttlVar2 = (ttl) tpcVarM.b;
            ttlVar2.b |= 4;
            ttlVar2.e = f5;
            float f6 = rect.top * f2;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ttl ttlVar3 = (ttl) tpcVarM.b;
            ttlVar3.b |= 2;
            ttlVar3.d = f6;
            float f7 = rect.bottom * f2;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ttl ttlVar4 = (ttl) tpcVarM.b;
            ttlVar4.b |= 8;
            ttlVar4.f = f7;
            ttl ttlVar5 = (ttl) tpcVarM.l();
            ArrayList arrayList2 = new ArrayList();
            ak(1, lnoVar.c, arrayList2, f, f2);
            ak(2, lnoVar.d, arrayList2, f, f2);
            ak(46, lnoVar.e, arrayList2, f, f2);
            ak(10, lnoVar.f, arrayList2, f, f2);
            ak(241, lnoVar.g, arrayList2, f, f2);
            ak(242, lnoVar.h, arrayList2, f, f2);
            tpe tpeVar = (tpe) ttn.a.m();
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar = (ttn) tpeVar.b;
            ttlVar5.getClass();
            ttnVar.c = ttlVar5;
            ttnVar.b |= 1;
            float f8 = lnoVar.b;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar2 = (ttn) tpeVar.b;
            ttnVar2.b |= 2;
            ttnVar2.e = f8 / 100.0f;
            float f9 = lnoVar.j;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar3 = (ttn) tpeVar.b;
            ttnVar3.b |= 16;
            ttnVar3.h = f9;
            float f10 = lnoVar.k;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar4 = (ttn) tpeVar.b;
            ttnVar4.b |= 8;
            ttnVar4.g = f10;
            float f11 = lnoVar.l;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar5 = (ttn) tpeVar.b;
            ttnVar5.b |= 4;
            ttnVar5.f = f11;
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ttn ttnVar6 = (ttn) tpeVar.b;
            tpw tpwVar = ttnVar6.d;
            if (!tpwVar.c()) {
                ttnVar6.d = tph.v(tpwVar);
            }
            tnq.e(arrayList2, ttnVar6.d);
            tpc tpcVarM2 = tuw.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tuw tuwVar = (tuw) tpcVarM2.b;
            tuwVar.b |= 4;
            tuwVar.e = fFloatValue;
            if (i2 != -1) {
                if (!tpeVar.b.C()) {
                    tpeVar.o();
                }
                ttn ttnVar7 = (ttn) tpeVar.b;
                ttnVar7.b |= 64;
                ttnVar7.j = j;
                if (!tpeVar.b.C()) {
                    tpeVar.o();
                }
                ttn ttnVar8 = (ttn) tpeVar.b;
                ttnVar8.b |= 128;
                ttnVar8.k = j;
                if (hpyVar != null) {
                    tpc tpcVarM3 = tux.a.m();
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    tux tuxVar = (tux) tpcVarM3.b;
                    tpm tpmVar = tuxVar.c;
                    if (!tpmVar.c()) {
                        tuxVar.c = tph.s(tpmVar);
                    }
                    tnq.e(hpyVar.b, tuxVar.c);
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    float f12 = hpyVar.c;
                    tux tuxVar2 = (tux) tpcVarM3.b;
                    tuxVar2.b |= 1;
                    tuxVar2.d = f12;
                    tux tuxVar3 = (tux) tpcVarM3.l();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tuw tuwVar2 = (tuw) tpcVarM2.b;
                    tuxVar3.getClass();
                    tuwVar2.h = tuxVar3;
                    tuwVar2.b |= 32;
                }
            }
            tpeVar.aI(tuw.j, (tuw) tpcVarM2.l());
            arrayList.add((ttn) tpeVar.l());
            i++;
            lnlVar2 = lnlVar;
            lnoVarArr = lnoVarArr2;
            map = map3;
        }
        tpc tpcVarM4 = tto.a.m();
        if (!tpcVarM4.b.C()) {
            tpcVarM4.o();
        }
        tto ttoVar = (tto) tpcVarM4.b;
        tpw tpwVar2 = ttoVar.b;
        if (!tpwVar2.c()) {
            ttoVar.b = tph.v(tpwVar2);
        }
        tnq.e(arrayList, ttoVar.b);
        return (tto) tpcVarM4.l();
    }

    public static Point ad(Point point, qfr qfrVar, Rect rect) {
        int iHeight;
        float fB = qfrVar.b() / qfrVar.a();
        float fWidth = rect.width() / rect.height();
        int iWidth = rect.width();
        int iHeight2 = rect.height();
        int iWidth2 = 0;
        if (fB < fWidth) {
            iWidth = (int) (rect.height() * fB);
            iWidth2 = (int) ((rect.width() - iWidth) * 0.5f);
            iHeight = 0;
        } else {
            iHeight2 = (int) (rect.width() / fB);
            iHeight = (int) ((rect.height() - iHeight2) * 0.5f);
        }
        return new Point((((point.x - rect.left) - iWidth2) * qfrVar.b()) / iWidth, (((point.y - rect.top) - iHeight) * qfrVar.a()) / iHeight2);
    }

    public static Point ae(Point point, MeshWarp meshWarp) {
        if (meshWarp.a() == 0 || meshWarp.b() == 0) {
            return point;
        }
        if (!meshWarp.g()) {
            throw new IllegalArgumentException("Required forward mesh");
        }
        int iA = meshWarp.a();
        int iB = meshWarp.b();
        PixelRect pixelRectE = meshWarp.e();
        FloatVector floatVectorC = meshWarp.c();
        PointF pointF = new PointF((point.x - pixelRectE.a()) / pixelRectE.f(), (point.y - pixelRectE.c()) / pixelRectE.e());
        float fMin = Math.min(Math.max(pointF.x * iA, 0.0f), iA - 1);
        float fMin2 = Math.min(Math.max(pointF.y * iB, 0.0f), iB - 1);
        double d = fMin;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        double d2 = fMin2;
        int iFloor2 = (int) Math.floor(d2);
        int iCeil2 = (int) Math.ceil(d2);
        int i = iFloor2 * iA;
        int i2 = i + iFloor;
        int i3 = i2 + i2;
        Point point2 = new Point(i3, i3 + 1);
        int i4 = i + iCeil;
        int i5 = i4 + i4;
        Point point3 = new Point(i5, i5 + 1);
        int i6 = iCeil2 * iA;
        int i7 = i6 + iFloor;
        int i8 = i7 + i7;
        Point point4 = new Point(i8, i8 + 1);
        int i9 = i6 + iCeil;
        int i10 = i9 + i9;
        Point point5 = new Point(i10, i10 + 1);
        PointF pointF2 = new PointF(floatVectorC.a(point2.x), floatVectorC.a(point2.y));
        PointF pointF3 = new PointF(floatVectorC.a(point3.x), floatVectorC.a(point3.y));
        PointF pointF4 = new PointF(floatVectorC.a(point4.x), floatVectorC.a(point4.y));
        PointF pointF5 = new PointF(floatVectorC.a(point5.x), floatVectorC.a(point5.y));
        float f = fMin - iFloor;
        float f2 = fMin2 - iFloor2;
        float f3 = pointF3.x * f;
        float f4 = 1.0f - f;
        float f5 = pointF2.x * f4;
        float f6 = 1.0f - f2;
        return new Point((int) ((f2 * ((pointF5.x * f) + (pointF4.x * f4))) + (f6 * (f3 + f5))), (int) ((f * ((pointF5.y * f2) + (pointF3.y * f6))) + (f4 * ((pointF4.y * f2) + (pointF2.y * f6)))));
    }

    public static Point af(PointF pointF, float f, float f2) {
        if (pointF == null) {
            return null;
        }
        return new Point((int) (pointF.x * f), (int) (pointF.y * f2));
    }

    public static sbp ag(poe poeVar) {
        Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
        if (faceArr == null || rect == null) {
            int i = sbp.d;
            return sex.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Face face : faceArr) {
            Rect rect2 = pnu.a(face).c;
            arrayList.add(new FaceToBeautify2(new RectF((rect2.left - rect.left) / rect.width(), (rect2.top - rect.top) / rect.height(), (rect2.right - rect.left) / rect.width(), (rect2.bottom - rect.top) / rect.height()), rect.width() / rect.height()));
        }
        return sbp.j(arrayList);
    }

    public static boolean ah(pka pkaVar, ltf ltfVar) {
        return pkaVar == pka.FRONT || ltfVar == ltf.PORTRAIT;
    }

    public static String ai(String str) {
        return "CriticalPath#BlockedShutter#".concat(str);
    }

    public static void aj(hbj hbjVar, hbj hbjVar2, pnq pnqVar, hbc hbcVar, lwq lwqVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1400);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.ac, pnqVar.i());
        hbjVar.l(gzo.ad, true);
        hbjVar.l(gzo.ai, false);
        hbjVar.j(gzo.bt, false);
        hbjVar.l(gzo.aK, true);
        boolean z = pnqVar.m;
        hbjVar.l(gzo.bd, !z);
        gzg gzgVar = gzo.bs;
        boolean z2 = pnqVar.n;
        hbjVar.l(gzgVar, z2);
        hbjVar.g(hba.n, Float.valueOf(4.3f));
        float f = true != z2 ? 7.0f : 20.0f;
        gzg gzgVar2 = hba.o;
        Float fValueOf = Float.valueOf(f);
        hbjVar.g(gzgVar2, fValueOf);
        hbjVar.g(hba.j, Float.valueOf(true != z2 ? 7.0f : 4.0f));
        hbjVar.l(gze.g, true);
        gzg gzgVar3 = gze.b;
        Float fValueOf2 = Float.valueOf(1.0f);
        hbjVar.g(gzgVar3, fValueOf2);
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gyv.d, true);
        hbjVar.l(gyv.e, false);
        hbjVar.l(haz.b, false);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.af, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.Q, false);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        gzg gzgVar4 = gym.y;
        Float fValueOf3 = Float.valueOf(7.0f);
        hbjVar.g(gzgVar4, fValueOf3);
        hbjVar.g(gym.z, fValueOf3);
        hbjVar.g(gym.A, fValueOf3);
        hbjVar.g(gym.x, fValueOf);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.Z, true);
        hbjVar.l(gym.ah, z2);
        hbjVar.l(gym.ac, z2 || z);
        hbjVar.c(gym.k, 158);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(gzs.at, true);
        hbjVar.l(gzs.aU, true);
        hbjVar.l(gzs.ar, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.g(gzs.Z, Float.valueOf(999.0f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, true);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.h(hab.i, "motion.tflite.enc.uncompressed");
        hbjVar.h(hab.j, "saliency.tflite.enc.uncompressed");
        hbjVar.l(gze.i, true);
        hbjVar.l(gzw.e, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(gzz.C, true);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * (true != z2 ? 4 : 5)));
        hbjVar.c(hae.a, 300);
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar5 = hak.c;
        Float fValueOf4 = Float.valueOf(1.5172f);
        hbjVar.g(gzgVar5, fValueOf4);
        hbjVar.g(hak.d, fValueOf4);
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.Z, z2);
        hbjVar.l(hak.Y, z);
        hbjVar.l(hak.J, false);
        hbc hbcVar2 = hbc.FISHFOOD;
        if (hbcVar.b(hbcVar2)) {
            hbjVar.l(hak.I, false);
        }
        hbjVar.l(hak.A, z2);
        hbjVar.h(hak.M, "c21a1523ba6c48c2a0bf2ca4f6d6c0f0/c21a1523ba6c48c2a0bf2ca4f6d6c0f0.uncompressed");
        hbjVar.h(hak.P, MyBPCgKwEjJI.mFqQComOo);
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "de8bc16ea114427d88425742785fccac/de8bc16ea114427d88425742785fccac.uncompressed");
        hbjVar.h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
        hbjVar.c(gyk.b, 2016);
        hbjVar.c(gyk.c, 1508);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P21");
        hbjVar.l(hak.s, false);
        hbjVar.l(gzo.Z, true);
        hbjVar.l(gzo.ab, z2);
        hbjVar.l(hba.g, z2);
        hbjVar.l(hba.h, true);
        hbjVar.l(gzo.aa, z2);
        gzi gziVar = hau.a;
        hbcVar.b(hbcVar2);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.d, false);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_pixel6.tflite.uncompressed");
        hbjVar.l(gyx.i, true);
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_abrolhos_b0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_abrolhos_b0.tflite.uncompressed");
        hbjVar.l(has.d, false);
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.l(gys.d, true);
        hbjVar.h(haq.f, "avenh-model0-abrolhos.tflite.uncompressed");
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzs.O, true);
        hbjVar.h(gzs.P, "lancet-p21.tflite.uncompressed");
        hbjVar.l(gzs.au, true);
        hbjVar.h(gzs.aw, "pecan-p21-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aK, false);
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        hbjVar.l(gze.d, false);
        hbjVar.l(gzs.D, false);
        hbjVar.l(gzs.E, false);
        gzg gzgVar6 = gyg.h;
        hbc hbcVar3 = hbc.DOGFOOD;
        hbjVar.l(gzgVar6, hbcVar.b(hbcVar3));
        hbjVar.l(gyg.i, hbcVar.b(hbcVar3));
        hbjVar.l(gyg.j, hbcVar.b(hbcVar3));
        hbjVar.j(hal.a, z2);
        hbjVar.j(hal.b, false);
        hbjVar.j(hal.c, false);
        hbjVar.j(hal.d, false);
        hbjVar.j(hal.e, z2);
        hbjVar.j(gzo.bC, !z2);
        hbjVar.g(hal.l, Float.valueOf(0.7f));
        hbjVar.g(hal.m, fValueOf2);
        hbjVar.g(hal.n, fValueOf2);
        gzg gzgVar7 = hal.o;
        Float fValueOf5 = Float.valueOf(4.0f);
        hbjVar.g(gzgVar7, fValueOf5);
        hbjVar.g(hal.p, fValueOf5);
        hbjVar.g(hal.q, Float.valueOf(20.0f));
        hbjVar.l(gzs.aP, false);
    }

    private static void ak(int i, PointF pointF, ArrayList arrayList, float f, float f2) {
        if (pointF == null || pointF.x < -1000.0f) {
            return;
        }
        tpc tpcVarM = ttm.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ttm ttmVar = (ttm) tpcVarM.b;
        ttmVar.e = i - 1;
        ttmVar.b |= 8;
        float f3 = f * pointF.x;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ttm ttmVar2 = (ttm) tpcVarM.b;
        ttmVar2.b |= 1;
        ttmVar2.c = f3;
        float f4 = f2 * pointF.y;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ttm ttmVar3 = (ttm) tpcVarM.b;
        ttmVar3.b |= 2;
        ttmVar3.d = f4;
        arrayList.add((ttm) tpcVarM.l());
    }

    public static Intent d(boolean z, boolean z2, boolean z3, long[] jArr) {
        Intent intent;
        if (z2) {
            if (z) {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW_SECURE");
                intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            } else {
                intent = new Intent("com.google.android.apps.photos.mars.api.ACTION_REVIEW");
            }
            if (jArr.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
            }
        } else if (z) {
            intent = new Intent("android.provider.action.REVIEW_SECURE");
            intent.putExtra("com.google.android.apps.photos.api.secure_mode", true);
            if (jArr.length != 0) {
                intent.putExtra("com.google.android.apps.photos.api.secure_mode_ids", jArr);
            }
        } else {
            intent = new Intent("android.provider.action.REVIEW");
        }
        if (z3) {
            intent.addFlags(268435456);
        }
        intent.setPackage("com.google.android.apps.photos");
        intent.addFlags(1);
        return intent;
    }

    public static pas f(oxj oxjVar, List list) {
        pas pasVar = new pas(0, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pas pasVar2 = (pas) it.next();
            if (pasVar2.a >= 300 && pasVar2.b >= 300 && pae.i(pasVar2).equals(pae.i(oxjVar.c())) && (pasVar.b() == 0 || pasVar2.b() < pasVar.b())) {
                pasVar = pasVar2;
            }
        }
        return pasVar;
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : YyLACfm.joSeVfSmsu : "PAUSED" : "RECORDING" : "NOT_STARTED";
    }

    public static int h(spe speVar) {
        int iOrdinal = speVar.ordinal();
        if (iOrdinal == 1) {
            return 3;
        }
        switch (iOrdinal) {
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            default:
                return 2;
        }
    }

    public static fnt i(TrackingState trackingState) {
        ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        RecordingStatus recordingStatus = RecordingStatus.NONE;
        PlaybackStatus playbackStatus = PlaybackStatus.NONE;
        Point.OrientationMode orientationMode = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
        Coordinates2d coordinates2d = Coordinates2d.TEXTURE_TEXELS;
        TrackingFailureReason trackingFailureReason = TrackingFailureReason.NONE;
        TrackingState trackingState2 = TrackingState.TRACKING;
        Config.UpdateMode updateMode = Config.UpdateMode.BLOCKING;
        Config.InstantPlacementMode instantPlacementMode = Config.InstantPlacementMode.DISABLED;
        Config.DepthMode depthMode = Config.DepthMode.DISABLED;
        int iOrdinal = trackingState.ordinal();
        if (iOrdinal == 0) {
            return fnt.TRACKING;
        }
        if (iOrdinal == 1) {
            return fnt.PAUSED;
        }
        if (iOrdinal == 2) {
            return fnt.STOPPED;
        }
        throw new RuntimeException(null, null);
    }

    public static Coordinates2d j(int i) {
        ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        RecordingStatus recordingStatus = RecordingStatus.NONE;
        PlaybackStatus playbackStatus = PlaybackStatus.NONE;
        Point.OrientationMode orientationMode = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
        Coordinates2d coordinates2d = Coordinates2d.TEXTURE_TEXELS;
        TrackingFailureReason trackingFailureReason = TrackingFailureReason.NONE;
        TrackingState trackingState = TrackingState.TRACKING;
        Config.UpdateMode updateMode = Config.UpdateMode.BLOCKING;
        Config.InstantPlacementMode instantPlacementMode = Config.InstantPlacementMode.DISABLED;
        Config.DepthMode depthMode = Config.DepthMode.DISABLED;
        int i2 = i - 1;
        return i2 != 3 ? i2 != 5 ? Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES : Coordinates2d.VIEW : Coordinates2d.IMAGE_NORMALIZED;
    }

    public static Object k(Supplier supplier) {
        try {
            return supplier.get();
        } catch (RuntimeException e) {
            throw l(e);
        }
    }

    public static RuntimeException l(RuntimeException runtimeException) {
        return runtimeException instanceof DeadlineExceededException ? new fnv(runtimeException) : runtimeException instanceof FatalException ? new fnw(runtimeException) : runtimeException instanceof NotTrackingException ? new fnx(runtimeException) : runtimeException instanceof ResourceExhaustedException ? new fnz(runtimeException) : runtimeException instanceof SessionPausedException ? new foa(runtimeException) : runtimeException;
    }

    public static void m(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            throw l(e);
        }
    }

    public static void n(hbj hbjVar, hbj hbjVar2, hbc hbcVar, lwq lwqVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1400);
        hbjVar.l(gzo.ac, true);
        hbjVar.l(gzo.ad, true);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.j(gzo.bt, false);
        hbjVar.l(gzo.ai, false);
        hbjVar.l(gzo.aK, true);
        hbjVar.l(gzo.bd, true);
        hbjVar.g(hba.n, Float.valueOf(5.0f));
        hbjVar.g(hba.l, Float.valueOf(0.530602f));
        gzg gzgVar = hba.o;
        Float fValueOf = Float.valueOf(8.0f);
        hbjVar.g(gzgVar, fValueOf);
        hbjVar.l(hba.i, true);
        hbjVar.g(hba.j, fValueOf);
        hbjVar.l(hba.k, true);
        hbjVar.l(gze.g, true);
        hbjVar.g(gze.b, Float.valueOf(1.0f));
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gyv.d, true);
        hbjVar.l(gyv.e, false);
        hbjVar.l(haz.b, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.af, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.Q, false);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        hbjVar.l(gym.ai, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.Z, true);
        hbjVar.l(gym.aj, false);
        hbjVar.c(gym.k, 128);
        hbjVar.l(gzs.at, true);
        hbjVar.l(gzs.aU, true);
        hbjVar.l(gzs.ar, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.g(gzs.Z, Float.valueOf(999.0f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(gze.i, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 4));
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hae.x, true);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar2 = hak.c;
        Float fValueOf2 = Float.valueOf(1.7214f);
        hbjVar.g(gzgVar2, fValueOf2);
        hbjVar.g(hak.d, fValueOf2);
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(6.9f));
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.A, true);
        hbjVar.h(hak.M, "c21a1523ba6c48c2a0bf2ca4f6d6c0f0/c21a1523ba6c48c2a0bf2ca4f6d6c0f0.uncompressed");
        hbjVar.h(hak.P, "9599cabbb2fa4aa79ee0c44f0c1553ad/9599cabbb2fa4aa79ee0c44f0c1553ad.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "de8bc16ea114427d88425742785fccac/de8bc16ea114427d88425742785fccac.uncompressed");
        hbjVar.h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
        hbjVar.c(gyk.b, 2104);
        hbjVar.c(gyk.c, 1560);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P22");
        hbjVar.l(gzo.Z, true);
        hbjVar.l(hba.g, false);
        hbjVar.l(hba.h, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op.tflite.uncompressed");
        hbjVar.l(gyx.i, true);
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.l(has.d, false);
        hbjVar.l(gys.d, true);
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, false);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p22.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p22.tflite.uncompressed");
        hbjVar.h(haq.f, "avenh-model0-janeiro.tflite.uncompressed");
        gzi gziVar = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzs.O, true);
        hbjVar.h(gzs.P, "lancet-p22.tflite.uncompressed");
        hbjVar.l(gzs.au, true);
        hbjVar.l(gzs.az, true);
        hbjVar.h(gzs.aw, "pecan-l10-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aK, false);
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        gzg gzgVar3 = gyg.h;
        hbc hbcVar2 = hbc.DOGFOOD;
        hbjVar.l(gzgVar3, hbcVar.b(hbcVar2));
        hbjVar.l(gyg.i, hbcVar.b(hbcVar2));
        hbjVar.l(gyg.j, hbcVar.b(hbcVar2));
        hbjVar.l(gzs.aO, true);
        hbjVar.l(gzs.aP, false);
    }

    public static void o(hbj hbjVar, hbj hbjVar2, lwq lwqVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1400);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.ac, true);
        hbjVar.l(gzo.ad, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.l(gzo.ai, false);
        hbjVar.l(gzo.aX, true);
        hbjVar.l(gzo.bd, true);
        gzg gzgVar = hba.n;
        Float fValueOf = Float.valueOf(5.0f);
        hbjVar.g(gzgVar, fValueOf);
        hbjVar.g(hba.l, Float.valueOf(0.661693f));
        hbjVar.g(hba.o, Float.valueOf(30.0f));
        hbjVar.l(hba.i, true);
        hbjVar.g(hba.j, Float.valueOf(8.0f));
        hbjVar.l(hba.k, true);
        hbjVar.l(gyh.c, true);
        hbjVar.l(gze.g, true);
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gyv.d, true);
        hbjVar.l(gyv.e, false);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.af, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.Q, false);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        gzg gzgVar2 = gym.y;
        Float fValueOf2 = Float.valueOf(20.0f);
        hbjVar.g(gzgVar2, fValueOf2);
        hbjVar.g(gym.z, fValueOf2);
        hbjVar.g(gym.A, Float.valueOf(7.0f));
        hbjVar.g(gym.x, fValueOf2);
        hbjVar.l(gym.w, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.am, true);
        hbjVar.l(gym.Z, true);
        hbjVar.l(gym.I, true);
        hbjVar.l(gym.ac, true);
        hbjVar.c(gym.k, 153);
        hbjVar.c(gym.l, 128);
        hbjVar.h(haq.f, "avenh-model0-janeiro.tflite.uncompressed");
        hbjVar.l(gys.d, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op.tflite.uncompressed");
        hbjVar.l(gyx.i, true);
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.l(has.d, false);
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(gzs.at, true);
        hbjVar.l(gzs.aU, true);
        hbjVar.l(gzs.ar, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.g(gzs.Z, Float.valueOf(999.0f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, false);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p22.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p22.tflite.uncompressed");
        hbjVar.l(gze.i, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 5));
        hbjVar.c(hae.a, 300);
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hae.x, true);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar3 = hak.c;
        Float fValueOf3 = Float.valueOf(1.4881f);
        hbjVar.g(gzgVar3, fValueOf3);
        hbjVar.g(hak.d, fValueOf3);
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(7.4f));
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.A, true);
        hbjVar.h(hak.M, "c21a1523ba6c48c2a0bf2ca4f6d6c0f0/c21a1523ba6c48c2a0bf2ca4f6d6c0f0.uncompressed");
        hbjVar.h(hak.P, "9599cabbb2fa4aa79ee0c44f0c1553ad/9599cabbb2fa4aa79ee0c44f0c1553ad.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "de8bc16ea114427d88425742785fccac/de8bc16ea114427d88425742785fccac.uncompressed");
        hbjVar.h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
        hbjVar.c(gyk.b, 1896);
        hbjVar.c(gyk.c, 1424);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P22");
        hbjVar.l(gza.a, true);
        hbjVar.l(gza.b, true);
        hbjVar.l(gza.c, true);
        hbjVar.l(gza.d, true);
        hbjVar.l(gza.e, true);
        hbjVar.l(gza.f, true);
        hbjVar.l(gza.t, true);
        hbjVar.l(gza.q, true);
        hbjVar.l(gza.r, true);
        hbjVar.l(gza.s, true);
        hbjVar.l(gza.g, true);
        hbjVar.l(gzo.Z, true);
        hbjVar.l(hba.h, true);
        hbjVar.l(gzo.aa, true);
        gzi gziVar = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzs.O, true);
        hbjVar.h(gzs.P, "lancet-p22.tflite.uncompressed");
        hbjVar.l(gzs.au, true);
        hbjVar.h(gzs.aw, "pecan-p22-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aA, true);
        hbjVar.h(gzs.ax, "pecan-p22-luma-hybrid-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aK, false);
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        hbjVar.j(hal.a, true);
        hbjVar.j(hal.b, false);
        hbjVar.j(hal.c, false);
        hbjVar.j(hal.d, false);
        hbjVar.j(hal.e, true);
        hbjVar.j(gzo.bC, false);
        hbjVar.g(hal.l, Float.valueOf(0.6f));
        gzg gzgVar4 = hal.m;
        Float fValueOf4 = Float.valueOf(1.0f);
        hbjVar.g(gzgVar4, fValueOf4);
        hbjVar.g(hal.n, fValueOf4);
        hbjVar.g(hal.o, fValueOf);
        hbjVar.g(hal.p, fValueOf);
        hbjVar.g(hal.q, fValueOf2);
        hbjVar.l(gzs.aP, false);
    }

    public static void q(hbj hbjVar, hbj hbjVar2, pnq pnqVar, pnp pnpVar, hbc hbcVar, lwq lwqVar) {
        boolean z;
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1400);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.ac, pnqVar.c());
        hbjVar.l(gzo.ad, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.l(gzo.ai, false);
        hbjVar.l(gzo.aK, true);
        hbjVar.l(gzo.bd, true);
        gzg gzgVar = hba.n;
        Float fValueOf = Float.valueOf(5.0f);
        hbjVar.g(gzgVar, fValueOf);
        boolean z2 = pnqVar.r;
        hbjVar.g(hba.l, Float.valueOf(true != z2 ? 0.670443f : 0.556325f));
        hbjVar.g(hba.o, Float.valueOf(true != z2 ? 8.0f : 30.0f));
        hbjVar.g(hba.j, Float.valueOf(true == z2 ? 10.0f : 8.0f));
        hbjVar.l(hba.i, z2);
        hbjVar.c(hba.a, Integer.valueOf(true != z2 ? 1 : 10));
        hbjVar.l(hba.k, true);
        hbjVar.h(gzo.aR, "3840x2736");
        hbjVar.l(gyh.c, z2);
        hbjVar.l(gze.g, true);
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gyv.d, true);
        hbjVar.l(gyv.e, false);
        hbjVar.l(haz.b, false);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.af, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.Q, false);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.U, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        hbjVar.g(gym.y, Float.valueOf((z2 || pnqVar.q) ? 20.0f : 7.0f));
        hbjVar.g(gym.z, Float.valueOf((z2 || pnqVar.q) ? 20.0f : 7.0f));
        hbjVar.g(gym.A, Float.valueOf(7.0f));
        hbjVar.g(gym.x, Float.valueOf((z2 || pnqVar.q) ? 20.0f : 7.0f));
        hbjVar.l(gym.w, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.am, true);
        hbjVar.l(gym.aj, true);
        hbjVar.l(gym.Z, true);
        hbjVar.l(gym.I, true);
        hbjVar.l(gym.ac, true);
        hbjVar.c(gym.k, 153);
        hbjVar.h(haq.f, "avenh-model0-janeiro.tflite.uncompressed");
        hbjVar.l(gys.d, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op.tflite.uncompressed");
        hbjVar.l(gyx.i, true);
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.l(gzc.C, z2);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(gzs.at, true);
        hbjVar.l(gzs.aU, true);
        hbjVar.l(gzs.ar, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.g(gzs.Z, Float.valueOf(999.0f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, true);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p22.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p22.tflite.uncompressed");
        hbjVar.l(gze.i, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(gzz.E, true);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 5));
        hbjVar.c(hae.a, 300);
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar2 = hak.c;
        Float fValueOf2 = Float.valueOf(1.5172f);
        hbjVar.g(gzgVar2, fValueOf2);
        hbjVar.g(hak.d, fValueOf2);
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(7.6f));
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.A, z2);
        hbjVar.h(hak.M, "c21a1523ba6c48c2a0bf2ca4f6d6c0f0/c21a1523ba6c48c2a0bf2ca4f6d6c0f0.uncompressed");
        hbjVar.h(hak.P, "9599cabbb2fa4aa79ee0c44f0c1553ad/9599cabbb2fa4aa79ee0c44f0c1553ad.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "de8bc16ea114427d88425742785fccac/de8bc16ea114427d88425742785fccac.uncompressed");
        hbjVar.h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
        hbjVar.c(gyk.b, 2016);
        hbjVar.c(gyk.c, 1508);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P22");
        hbjVar.l(gzo.Z, true);
        hbjVar.l(gzo.ab, true);
        hbjVar.l(hba.g, true);
        hbjVar.l(hba.h, true);
        hbjVar.l(gzo.aa, z2);
        gzi gziVar = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzy.j, z2);
        gzg gzgVar3 = gzy.k;
        if (z2) {
            boolean z3 = pnpVar.f;
            z = true;
        } else {
            z = false;
        }
        hbjVar.l(gzgVar3, z);
        hbjVar.l(gzs.O, true);
        hbjVar.h(gzs.P, "lancet-p22.tflite.uncompressed");
        hbjVar.l(gzs.Q, true);
        hbjVar.l(gzs.au, true);
        hbjVar.h(gzs.aw, "pecan-p22-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aK, false);
        int i = gyu.a;
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        gzg gzgVar4 = gyg.h;
        hbc hbcVar2 = hbc.DOGFOOD;
        hbjVar.l(gzgVar4, hbcVar.b(hbcVar2));
        hbjVar.l(gyg.i, hbcVar.b(hbcVar2));
        hbjVar.l(gyg.j, hbcVar.b(hbcVar2));
        hbjVar.j(hal.a, z2);
        hbjVar.j(hal.b, false);
        hbjVar.j(hal.c, false);
        hbjVar.j(hal.d, false);
        hbjVar.j(hal.e, z2);
        hbjVar.j(gzo.bC, !z2);
        hbjVar.g(hal.l, Float.valueOf(0.5f));
        gzg gzgVar5 = hal.m;
        Float fValueOf3 = Float.valueOf(1.0f);
        hbjVar.g(gzgVar5, fValueOf3);
        hbjVar.g(hal.n, fValueOf3);
        hbjVar.g(hal.o, fValueOf);
        hbjVar.g(hal.p, fValueOf);
        hbjVar.g(hal.q, Float.valueOf(30.0f));
        hbjVar.l(gzs.aP, false);
    }

    public static void r(hbj hbjVar, hbj hbjVar2, hbc hbcVar, lwq lwqVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1400);
        hbjVar.l(gzo.ac, true);
        hbjVar.l(gzo.ad, true);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.j(gzo.bt, false);
        hbjVar.j(gzo.bA, false);
        hbjVar.l(gzo.ai, false);
        hbjVar.l(gzo.bd, true);
        hbjVar.g(hba.n, Float.valueOf(5.0f));
        hbjVar.g(hba.l, Float.valueOf(0.530602f));
        gzg gzgVar = hba.o;
        Float fValueOf = Float.valueOf(8.0f);
        hbjVar.g(gzgVar, fValueOf);
        hbjVar.l(hba.i, true);
        hbjVar.g(hba.j, fValueOf);
        hbjVar.l(gze.g, true);
        hbjVar.g(gze.b, Float.valueOf(1.0f));
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gyv.d, true);
        hbjVar.l(gyv.e, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.at, true);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        hbjVar.l(gym.ai, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.H, false);
        hbjVar.l(gym.aj, false);
        hbjVar.c(gym.k, 146);
        hbjVar.l(gzs.at, true);
        hbjVar.l(gzs.aU, true);
        hbjVar.l(gzs.ar, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.g(gzs.Z, Float.valueOf(999.0f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(gze.i, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 4));
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hae.x, true);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar2 = hak.c;
        Float fValueOf2 = Float.valueOf(1.7214f);
        hbjVar.g(gzgVar2, fValueOf2);
        hbjVar.g(hak.d, fValueOf2);
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(3.0f));
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.ad, true);
        hbjVar.l(hak.ae, true);
        hbjVar.l(hak.aa, true);
        hbjVar.l(hak.A, true);
        hbjVar.l(hak.K, true);
        hbjVar.l(hak.L, true);
        hbjVar.h(hak.M, "4cdbd4b13ea54a309eb235a75232ae6d/4cdbd4b13ea54a309eb235a75232ae6d.uncompressed");
        hbjVar.h(hak.P, "5751e2e2a711430695dac2c034cfd295/5751e2e2a711430695dac2c034cfd295.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "cac29f5597f5453bbabb54f6f2080e39/cac29f5597f5453bbabb54f6f2080e39.uncompressed");
        hbjVar.h(hak.U, "a7ab2018912b4f958760b7763b36256a/a7ab2018912b4f958760b7763b36256a.uncompressed");
        hbjVar.c(gyk.b, 2104);
        hbjVar.c(gyk.c, 1560);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P23");
        hbjVar.l(gzo.Z, true);
        hbjVar.l(hba.g, false);
        hbjVar.l(hba.h, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_p23.tflite.uncompressed");
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.l(gys.d, true);
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.c(gzc.g, 2);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, false);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p23.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p23.tflite.uncompressed");
        hbjVar.h(haq.f, "avenh-model0-rio.tflite.uncompressed");
        gzi gziVar = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzs.O, true);
        hbjVar.l(gzs.Q, true);
        hbjVar.h(gzs.P, "lancet_alpha_v2-p23.tflite.uncompressed");
        hbjVar.l(gzs.au, true);
        hbjVar.l(gzs.az, true);
        hbjVar.h(gzs.aw, "pecan-ak3-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aK, false);
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        hbjVar.l(gzs.aO, true);
        hbjVar.l(hai.b, false);
        hbjVar.l(gzs.aF, true);
        if (hbcVar.b(hbc.DOGFOOD)) {
            hbjVar.l(gzp.k, true);
        }
        hbjVar.g(gzp.n, Float.valueOf(0.75f));
    }

    public static /* synthetic */ gyc s(tpc tpcVar) {
        tph tphVarI = tpcVar.l();
        tphVarI.getClass();
        return (gyc) tphVarI;
    }

    public static void t(float f, tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyc gycVar = (gyc) tpcVar.b;
        gyc gycVar2 = gyc.a;
        gycVar.b |= 1;
        gycVar.c = f;
    }

    public static boolean u(float f, float f2) {
        return Math.abs(Math.toDegrees((double) (f2 - f))) >= ((Math.abs(Math.toDegrees((double) f)) > 1.0d ? 1 : (Math.abs(Math.toDegrees((double) f)) == 1.0d ? 0 : -1)) <= 0 ? 0.1d : 0.5d);
    }

    public static gpo v(rwc rwcVar, nnw nnwVar, int i, int i2) {
        boolean z;
        PointF pointF;
        if (!rwcVar.h() || nnwVar == null || i == 0 || i2 == 0) {
            return null;
        }
        float f = i;
        float f2 = i2;
        PointF pointF2 = new PointF(((RectF) rwcVar.c()).centerX() / f, ((RectF) rwcVar.c()).centerY() / f2);
        float fHeight = ((RectF) rwcVar.c()).height() / f2;
        float fWidth = ((RectF) rwcVar.c()).width() / f;
        int i3 = nnwVar.b;
        if (i3 == 90) {
            z = true;
        } else if (i3 == 270) {
            i3 = 270;
            z = true;
        } else {
            z = false;
        }
        float f3 = true != z ? fWidth : fHeight;
        if (true == z) {
            fHeight = fWidth;
        }
        if (i3 == 0) {
            pointF = pointF2;
        } else if (i3 == 90) {
            pointF = new PointF(1.0f - pointF2.y, pointF2.x);
        } else if (i3 == 180) {
            pointF = new PointF(1.0f - pointF2.x, 1.0f - pointF2.y);
        } else {
            if (i3 != 270) {
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
            }
            pointF = new PointF(pointF2.y, 1.0f - pointF2.x);
        }
        float f4 = f3 / 2.0f;
        float f5 = fHeight / 2.0f;
        return new gpo(new RectF(pointF.x - f4, pointF.y - f5, pointF.x + f4, pointF.y + f5), pointF2);
    }

    public static String w(String str) {
        return str.length() > 25 ? String.valueOf(str.substring(0, 24)).concat("…") : str;
    }

    public static /* synthetic */ String x(int i) {
        return i != 2 ? "OPEN" : "ENUMERATION";
    }

    public static TextView y(Context context) throws Resources.NotFoundException {
        TextView textView = new TextView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dialog_vertical_padding);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        return textView;
    }

    public static TextView z(int i, Context context, Runnable runnable) throws Resources.NotFoundException {
        String string = context.getResources().getString(i);
        String string2 = context.getResources().getString(R.string.learn_more);
        String str = string + " " + string2;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new gog(runnable), str.length() - string2.length(), str.length(), 33);
        TextView textViewY = y(context);
        textViewY.setText(spannableString);
        textViewY.setMovementMethod(LinkMovementMethod.getInstance());
        return textViewY;
    }

    public void b() {
        throw null;
    }

    public void c() {
    }

    public ezh(byte[] bArr) {
    }

    public static void p(hbj hbjVar, hbj hbjVar2, hbc hbcVar, lwq lwqVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        hbjVar.c(gzo.l, 1600);
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.ac, true);
        hbjVar.l(gzo.ad, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.l(gzo.aX, true);
        hbjVar.l(gzo.bd, true);
        hbjVar.l(gzo.ai, false);
        hbjVar.h(gzo.aR, "3466x2600");
        hbjVar.g(hba.n, Float.valueOf(5.0f));
        hbjVar.g(hba.l, Float.valueOf(0.505887f));
        hbjVar.g(hba.o, Float.valueOf(30.0f));
        hbjVar.l(hba.i, true);
        hbjVar.g(hba.j, Float.valueOf(8.0f));
        hbjVar.l(hba.k, true);
        hbjVar.l(gyh.c, true);
        hbjVar.g(gyh.a, Float.valueOf(0.626f));
        hbjVar.g(gyh.b, Float.valueOf(0.81f));
        hbjVar.l(gyh.g, true);
        hbjVar.l(gyh.e, true);
        hbjVar.l(gyh.f, true);
        hbjVar.l(gze.g, true);
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.l, true);
        hbjVar.l(gze.n, false);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.af, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.Q, false);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        gzg gzgVar = gym.y;
        Float fValueOf = Float.valueOf(20.0f);
        hbjVar.g(gzgVar, fValueOf);
        hbjVar.g(gym.z, fValueOf);
        hbjVar.g(gym.A, Float.valueOf(7.0f));
        hbjVar.g(gym.x, fValueOf);
        hbjVar.l(gym.w, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.am, true);
        hbjVar.l(gym.Z, false);
        hbjVar.l(gym.I, true);
        hbjVar.l(gym.ac, true);
        hbjVar.c(gym.k, 161);
        hbjVar.c(gym.l, 171);
        hbjVar.l(gym.at, true);
        hbjVar.l(gym.H, false);
        hbjVar.l(gym.B, true);
        hbjVar.l(hax.c, true);
        hbc hbcVar2 = hbc.DOGFOOD;
        hbcVar.b(hbcVar2);
        hbjVar.l(hax.g, true);
        hbcVar.b(hbcVar2);
        hbjVar.h(haq.f, pAAtrB.oBOhcpd);
        hbjVar.l(gys.d, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.c(gyx.a, 4);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_p23.tflite.uncompressed");
        hbjVar.l(gyx.i, true);
        gzg gzgVar2 = hah.a;
        hbjVar.h(hah.a, "8bd5e22b220348078faf705e9f359e3d.tflite.uncompressed");
        hbjVar.h(hah.b, "09071335e3914c00ac0a00f29193b4c7.tflite.uncompressed");
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.x, true);
        hbjVar.l(gzc.B, true);
        hbjVar.c(gzc.f, 2048);
        hbjVar.l(gzs.ab, true);
        hbjVar.l(gzs.at, true);
        hbjVar.j(gzs.Y, false);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, false);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p23.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p23.tflite.uncompressed");
        hbjVar.l(gze.i, true);
        boolean zB = lwqVar.b();
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, zB);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(haa.aj, true);
        hbjVar.l(gzo.aV, true);
        hbjVar.l(haa.y, true);
        hbjVar.l(haa.z, true);
        hbjVar.l(haa.ak, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 5));
        hbjVar.c(hae.a, 300);
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hae.x, true);
        hbjVar.l(hae.y, true);
        hbjVar.l(hak.w, false);
        hbjVar.l(hak.y, true);
        hbjVar.l(hak.z, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        gzg gzgVar3 = hak.c;
        Float fValueOf2 = Float.valueOf(1.4881f);
        hbjVar.g(gzgVar3, fValueOf2);
        hbjVar.g(hak.d, fValueOf2);
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(3.0f));
        hbjVar.l(hak.aa, true);
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.A, true);
        hbjVar.l(hak.ad, true);
        hbjVar.l(hak.ae, true);
        hbjVar.l(hak.K, true);
        hbjVar.l(hak.L, true);
        hbjVar.h(hak.M, "dd674d048bbc43c1b338a6692cf9c481/dd674d048bbc43c1b338a6692cf9c481.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "a982533a4222473db9f191c212a99740/a982533a4222473db9f191c212a99740.uncompressed");
        hbjVar.h(hak.U, "f452199b34d445868df25db5b960f191/f452199b34d445868df25db5b960f191.uncompressed");
        hbjVar.h(hak.O, "a06600a838c64acd9c68ae65f8b2bc5f/a06600a838c64acd9c68ae65f8b2bc5f.uncompressed");
        hbjVar.j(hak.ak, true);
        hbjVar.c(hak.a, 10);
        hbjVar.c(gyk.b, 1920);
        hbjVar.c(gyk.c, 1368);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P23");
        hbjVar.l(gza.a, true);
        hbjVar.l(gza.b, false);
        hbjVar.l(gza.c, false);
        hbjVar.l(gza.d, true);
        hbjVar.l(gza.e, false);
        hbjVar.l(gza.f, true);
        hbjVar.l(gza.t, true);
        hbjVar.l(gza.q, true);
        hbjVar.l(gza.r, true);
        hbjVar.l(gza.s, true);
        hbjVar.l(gza.g, true);
        hbjVar.l(gza.h, true);
        hbcVar.b(hbc.FISHFOOD);
        hbjVar.l(gzo.Z, true);
        hbjVar.l(hba.h, true);
        hbjVar.l(gzo.aa, true);
        gzi gziVar = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzy.j, true);
        hbjVar.l(gzy.k, true);
        hbjVar.l(gzs.O, true);
        hbjVar.h(gzs.P, "lancet_alpha_v2-p24.tflite.uncompressed");
        hbjVar.l(gzs.R, true);
        hbjVar.h(gzs.S, "kepler_v2/p24");
        hbjVar.l(gzs.au, true);
        hbjVar.h(gzs.aw, "pecan-p23-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aA, true);
        hbjVar.h(gzs.ax, "pecan-p23-luma-hybrid-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.av, true);
        hbjVar.h(gzs.ay, "pecan-p24-pie-custom_op.tflite.uncompressed");
        hbjVar.h(gzs.aL, "walnut-p23-custom_op.tflite.uncompressed");
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        hbjVar.l(hai.b, false);
        hbjVar.j(hal.a, true);
        hbjVar.j(hal.b, true);
        hbjVar.j(hal.c, true);
        hbjVar.j(hal.d, true);
        hbjVar.j(hal.e, true);
        hbjVar.g(hal.q, fValueOf);
        hbjVar.j(gzo.bC, false);
        hbjVar.l(gzs.aF, true);
        hbjVar.l(gzq.d, true);
        hbjVar.l(gzq.e, true);
        int i = gzv.a;
        hbjVar.l(gyf.c, true);
        hbjVar.j(gyi.h, true);
        hbjVar.l(gzs.aM, true);
        hbjVar.h(gzs.aN, "almond-p24-custom_op.tflite.uncompressed");
        hbjVar.l(gzp.k, true);
    }

    public ezh(char[] cArr, byte[] bArr) {
    }

    public static float e(Context context, String str, float f) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, GdpuLBytnYW.oxQFIbCCwxmdZ, "android");
        if (identifier == 0) {
            return f;
        }
        return resources.getFloat(identifier);
    }

    public ezh(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8) {
        uemVar.getClass();
        uemVar2.getClass();
        uemVar3.getClass();
        uemVar4.getClass();
        uemVar5.getClass();
        uemVar6.getClass();
        uemVar7.getClass();
        uemVar8.getClass();
    }

    public ezh(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        Executors.newScheduledThreadPool(1);
        new HashMap();
    }

    public ezh(hbj hbjVar) {
        hbjVar.p(haa.o);
    }
}
