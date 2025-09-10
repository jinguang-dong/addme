package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;
import com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwq {
    public final Object a;
    public final Object b;

    public mwq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static void F(Context context) {
        context.startService(new Intent(context, (Class<?>) NoOpPrewarmService.class));
    }

    public static mwq b(int i, int i2, Rect rect, sbp sbpVar) {
        muz muzVar;
        ArrayList arrayList = new ArrayList();
        float fMax = 1.0f;
        if (i > 0 && i2 > 0 && rect.width() > 0 && rect.height() > 0) {
            fMax = Math.max(rect.width() / i, rect.height() / i2);
        }
        int i3 = ((sex) sbpVar).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ObjectInfo objectInfo = (ObjectInfo) sbpVar.get(i4);
            RectF rectF = (RectF) Objects.requireNonNullElse(objectInfo.bounds(), new RectF(0.0f, 0.0f, 0.0f, 0.0f));
            RectF rectF2 = new RectF(rectF.left * fMax, rectF.top * fMax, rectF.right * fMax, rectF.bottom * fMax);
            rectF2.offset(rect.left, rect.top);
            String str = (String) Objects.requireNonNullElse(objectInfo.label(), "");
            String str2 = (String) Objects.requireNonNullElse(objectInfo.libraryDisplayName(), "");
            muz[] muzVarArrValues = muz.values();
            int length = muzVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    muzVar = muzVarArrValues[i5];
                    if (muzVar.ak.equals(str)) {
                        switch (muzVar.ordinal()) {
                            case 8:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case ImageFormat.YUV_420_888 /* 35 */:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                                muzVar = muz.FOOD;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case ImageFormat.RGBA_FP16 /* 22 */:
                            case 23:
                                muzVar = muz.DRINK;
                                break;
                            case 42:
                            case 43:
                            case 45:
                            case 46:
                                muzVar = muz.V;
                                break;
                        }
                    } else {
                        i5++;
                    }
                } else {
                    muzVar = muz.UNKNOWN;
                }
            }
            muw muwVarA = mux.a();
            muwVarA.j(muzVar);
            muwVarA.c(objectInfo.id());
            muwVarA.a = rectF2;
            muwVarA.h(Math.round(objectInfo.score() * 100.0f));
            muwVarA.d(str);
            muwVarA.b = Optional.of(objectInfo);
            muwVarA.e(str2);
            Float fPan = objectInfo.pan();
            Float fValueOf = Float.valueOf(0.0f);
            muwVarA.f(((Float) Objects.requireNonNullElse(fPan, fValueOf)).floatValue());
            muwVarA.g(((Float) Objects.requireNonNullElse(objectInfo.roll(), fValueOf)).floatValue());
            muwVarA.i(((Float) Objects.requireNonNullElse(objectInfo.tilt(), fValueOf)).floatValue());
            arrayList.add(muwVarA.a());
        }
        return new mwq(rect, arrayList);
    }

    public static final Map q(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rwc rwcVar = ((lnx) it.next()).p;
            if (rwcVar.h()) {
                sbp sbpVarA = ((loi) rwcVar.c()).a();
                int i = ((sex) sbpVarA).c;
                for (int i2 = 0; i2 < i; i2++) {
                    loh lohVar = (loh) sbpVarA.get(i2);
                    Long lValueOf = Long.valueOf(lohVar.a);
                    map.put(lValueOf, Float.valueOf(Math.max(((Float) Map.EL.getOrDefault(map, lValueOf, Float.valueOf(0.0f))).floatValue(), lohVar.a())));
                }
            }
        }
        return map;
    }

    public static final boolean z() {
        return (nvl.d == null || nvl.b == null || nvl.e == null) ? false : true;
    }

    public final boolean A() {
        if (!((hbj) this.b).p(gzs.F)) {
            return false;
        }
        return ((Boolean) ((luj) this.a).b(luf.aT)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owq] */
    public final void B() {
        this.a.a(false);
        this.b.a(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void C(nkw nkwVar, uem uemVar) {
        nkwVar.getClass();
        this.b.put(nkwVar, uemVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pbn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.jtd D(defpackage.pjr r18, defpackage.nkw r19) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwq.D(pjr, nkw):jtd");
    }

    public final boolean E() {
        return ((iso) this.b).a();
    }

    public final void G(String str, int i, int i2) {
        ((phk) this.b).c.b(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void H(String str, String str2, int i, int i2, int i3, int i4) {
        ((phk) this.b).f.b(str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public final pmf I(final long j) {
        return (pmf) ((qpf) this.b).h(new pag() { // from class: pgz
            @Override // defpackage.pag
            public final Object a() {
                return ((pmg) this.b.a).e(j);
            }
        });
    }

    public final pmf J(final phx phxVar) {
        return (pmf) ((qpf) this.b).i(phxVar, new pag() { // from class: phb
            @Override // defpackage.pag
            public final Object a() {
                return ((pmg) phxVar.e.a).e(1L);
            }
        });
    }

    public final void K() {
        ((pt) this.b).c().aK();
    }

    public final void L() {
        ((pt) this.b).c().aK();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbc] */
    public final void M(int i) {
        int i2;
        java.util.Objects.toString(ojl.bE(i));
        this.a.f("Camera audio restriction set to ".concat(ojl.bE(i)));
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = 1;
            if (i3 != 1) {
                i2 = 3;
            }
        } else {
            i2 = 0;
        }
        ((pt) this.b).a(i2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pat] */
    public final Object N() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        return !arrayDeque.isEmpty() ? arrayDeque.removeFirst() : this.b.a();
    }

    public final void O(Object obj) {
        ((ArrayDeque) this.a).addFirst(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final void P(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.b;
        synchronized (r0) {
            map = new HashMap((java.util.Map) r0);
        }
        ?? r3 = this.a;
        synchronized (r3) {
            map2 = new HashMap((java.util.Map) r3);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).i(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((pfl) entry2.getKey()).e(new oep(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final sbp a() {
        return sbp.j(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.pka r4, defpackage.oxj r5, defpackage.oxh r6, boolean r7, defpackage.nkw r8) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L10
            pka r7 = defpackage.pka.BACK
            if (r4 != r7) goto L10
            boolean r7 = r8.a()
            if (r7 == 0) goto L10
            r7 = r0
            goto L11
        L10:
            r7 = r1
        L11:
            boolean r6 = defpackage.ezh.D(r6)
            boolean r8 = r5.d()
            if (r8 == 0) goto L1f
            if (r6 == 0) goto L1f
            r8 = r0
            goto L20
        L1f:
            r8 = r1
        L20:
            boolean r5 = r5.e()
            if (r5 == 0) goto L36
            if (r6 == 0) goto L36
            java.lang.Object r5 = r3.b
            pnq r5 = (defpackage.pnq) r5
            boolean r2 = r5.m
            if (r2 != 0) goto L36
            boolean r5 = r5.n
            if (r5 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r1
        L37:
            pka r2 = defpackage.pka.FRONT
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L41
            if (r6 != 0) goto L5b
        L41:
            pka r6 = defpackage.pka.BACK
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L59
            java.lang.Object r3 = r3.a
            gzg r4 = defpackage.haq.c
            hbj r3 = (defpackage.hbj) r3
            boolean r3 = r3.p(r4)
            if (r3 == 0) goto L59
            if (r8 != 0) goto L5b
            if (r5 != 0) goto L5b
        L59:
            if (r7 == 0) goto L5c
        L5b:
            return r0
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwq.c(pka, oxj, oxh, boolean, nkw):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void d(ncn ncnVar) {
        ncnVar.getClass();
        this.b.add(ncnVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void e(ncc nccVar) {
        ufj ufjVar = new ufj((ufm) nce.a);
        while (ufjVar.hasNext()) {
            Map.EL.putIfAbsent(this.a, (ncn) ufjVar.next(), nccVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void f(ncn ncnVar, ncc nccVar) {
        ncnVar.getClass();
        this.a.put(ncnVar, nccVar);
    }

    public final void g(ncn ncnVar) {
        ncnVar.getClass();
        f(ncnVar, new ncc() { // from class: ncd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ndw) obj).getClass();
                ((ndw) obj2).getClass();
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void h(CharSequence charSequence) {
        i(charSequence, (View) this.a);
    }

    public final void i(CharSequence charSequence, View view) {
        if (((AccessibilityManager) this.b).isTouchExplorationEnabled()) {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && contentDescription.toString().contentEquals(charSequence)) {
                view.setContentDescription("");
            }
            view.setAccessibilityLiveRegion(1);
            view.setContentDescription(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu j(Uri uri) {
        return ske.Q(new fsu(this, uri, 7), this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void k(Uri uri) {
        this.b.execute(new mzq(this, uri, 12, null));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void l(Uri uri) {
        this.b.execute(new mzq(this, uri, 13, null));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pbc] */
    public final owq m(String str, boolean z) {
        luk lukVar = (luk) this.b;
        if (!lukVar.l(str)) {
            this.a.f("Initializing default value (" + z + ") for key: (" + str + ")");
            lukVar.j(str, z);
        }
        return new ltj(lukVar, str);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pbc] */
    public final owq n(String str, int i) {
        luk lukVar = (luk) this.b;
        if (!lukVar.l(str)) {
            this.a.f("Initializing default value (" + i + ") for key: (" + str + ")");
            lukVar.h(str, i);
        }
        return new lto(lukVar, str);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pbc] */
    public final owq o(String str, String str2) {
        luk lukVar = (luk) this.b;
        if (!lukVar.l(str)) {
            this.a.f(a.by(str, str2, "Initializing default value (", ") for key: (", ")"));
            lukVar.i(str, str2);
        }
        return new luq(lukVar, str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void p(lnx lnxVar) {
        long j = lnxVar.a;
        this.a.add(lnxVar);
    }

    public final synchronized void r(long j, tsv tsvVar, tsw tswVar) {
        Long lValueOf = Long.valueOf(j);
        Object obj = this.b;
        ((TreeMap) obj).put(lValueOf, tsvVar);
        Object obj2 = this.a;
        ((TreeMap) obj2).put(lValueOf, tswVar);
        while (((TreeMap) obj).size() > 1000) {
            ((TreeMap) obj).remove(((TreeMap) obj).firstKey());
            ((TreeMap) obj2).remove(((TreeMap) obj2).firstKey());
        }
    }

    public final synchronized void s(long j) {
    }

    public final synchronized void t(long j) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int u(String str) {
        if (str == null) {
            return lnh.REAR_WIDE.e;
        }
        lcy lcyVar = (lcy) this.a.get(str);
        return (lcyVar == lcy.WIDE || lcyVar == lcy.WIDE_RM) ? lnh.REAR_WIDE.e : (lcyVar == lcy.ULTRAWIDE || lcyVar == lcy.ULTRAWIDE_RM) ? lnh.REAR_ULTRAWIDE.e : (lcyVar == lcy.TELE || lcyVar == lcy.TELE_RM) ? lnh.REAR_TELE.e : lnh.REAR_WIDE.e;
    }

    public final inr v() {
        pnq pnqVar = (pnq) this.b;
        if (pnqVar.i() || pnqVar.c() || pnqVar.p || pnqVar.t || pnqVar.o || pnqVar.u || pnqVar.l()) {
            return inr.a;
        }
        if (pnqVar.o() || pnqVar.x) {
            return inr.b;
        }
        if (pnqVar.f() || pnqVar.C) {
            return inr.c;
        }
        if (pnqVar.B) {
            return inr.d;
        }
        throw new rxd("Device is not recognizable. Aborting.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final lcy w(String str) {
        lcy lcyVar;
        return (str == null || (lcyVar = (lcy) this.a.get(str)) == null) ? lcy.WIDE : lcyVar;
    }

    public final int y(pjo pjoVar) {
        int iIntValue = ((Integer) ((hbj) this.b).a(hae.a).get()).intValue();
        int iIntValue2 = -1;
        if (z()) {
            try {
                iIntValue2 = ((Integer) pjoVar.n(nvl.e, -1)).intValue();
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
        }
        return Math.min(iIntValue, iIntValue2);
    }

    public mwq(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String x(boolean r3) {
        /*
            r2 = this;
            java.lang.Object r2 = r2.b
            pnq r2 = (defpackage.pnq) r2
            boolean r0 = r2.m
            if (r0 == 0) goto Lc
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.oriole"
            goto L79
        Lc:
            boolean r0 = r2.n
            java.lang.String r1 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.raven"
            if (r0 == 0) goto L15
        L12:
            r2 = r1
            goto L79
        L15:
            boolean r0 = r2.p
            if (r0 == 0) goto L1d
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.bluejay"
            goto L79
        L1d:
            boolean r0 = r2.s
            if (r0 == 0) goto L24
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.panther"
            goto L79
        L24:
            boolean r0 = r2.r
            if (r0 == 0) goto L2b
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.cheetah"
            goto L79
        L2b:
            boolean r0 = r2.o
            if (r0 == 0) goto L30
            goto L12
        L30:
            boolean r0 = r2.t
            if (r0 == 0) goto L37
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.1"
            goto L79
        L37:
            boolean r0 = r2.u
            if (r0 == 0) goto L3e
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.2"
            goto L79
        L3e:
            boolean r0 = r2.v
            if (r0 == 0) goto L45
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.3"
            goto L79
        L45:
            boolean r0 = r2.w
            if (r0 == 0) goto L4c
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.4"
            goto L79
        L4c:
            boolean r0 = r2.x
            if (r0 == 0) goto L53
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.5"
            goto L79
        L53:
            boolean r0 = r2.B
            if (r0 == 0) goto L5a
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.6"
            goto L79
        L5a:
            boolean r0 = r2.A
            if (r0 == 0) goto L61
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.7"
            goto L79
        L61:
            boolean r0 = r2.z
            if (r0 == 0) goto L68
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.8"
            goto L79
        L68:
            boolean r0 = r2.y
            if (r0 == 0) goto L6f
            java.lang.String r2 = "lib_cpi/geo_calibration_proto/multi_cam_calibration.combined.proto.9"
            goto L79
        L6f:
            boolean r2 = r2.C
            if (r2 != 0) goto L76
            java.lang.String r2 = ""
            goto L79
        L76:
            r2 = 0
            java.lang.String r2 = com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB.AQVWvAbzCpQlm
        L79:
            if (r3 == 0) goto L81
            java.lang.String r3 = ".obf"
            java.lang.String r2 = r2.concat(r3)
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwq.x(boolean):java.lang.String");
    }

    public mwq(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public mwq(byte[] bArr, byte[] bArr2) {
        this.b = new kfz(this);
        this.a = new Object();
    }

    public mwq(Context context, imi imiVar) {
        this.b = imiVar;
        nao naoVar = new nao();
        naoVar.e = context.getString(R.string.manual_focus_peaking_active_chip);
        naoVar.h = context;
        naoVar.j = 2;
        naoVar.a = true;
        naoVar.g = R.drawable.peaking_dot;
        this.a = naoVar.a();
    }

    public mwq(ncn ncnVar) {
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) ske.aV(ncnVar));
        enumSetCopyOf.getClass();
        this.b = enumSetCopyOf;
        this.a = new EnumMap(ncn.class);
    }

    public mwq(ocq ocqVar) {
        out.a();
        this.b = ocqVar;
        this.a = (ConstraintLayout) ocqVar.c(R.id.camera_app_root);
        ocqVar.c(R.id.preview_overlay);
    }

    public mwq(qqq qqqVar, pbb pbbVar) {
        this.a = qqqVar;
        this.b = pbbVar.a("CptModuleCfgBldr");
    }

    public mwq(java.util.Map map, pbn pbnVar) {
        this.a = pbnVar;
        this.b = new HashMap(map);
    }

    public mwq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ovx(false);
        this.b = new ovx(false);
    }

    public mwq(char[] cArr) {
        this.b = new TreeMap();
        this.a = new TreeMap();
    }

    public mwq(byte[] bArr) {
        this.a = new ovx(false);
        this.b = new ovx(false);
    }

    public mwq() {
        this.b = new ArrayList();
        this.a = new ArrayList();
    }

    public mwq(Optional optional) {
        this.a = new CopyOnWriteArrayList();
        this.b = optional;
    }

    public mwq(out outVar) {
        this.a = new HashSet();
        this.b = outVar;
    }

    public mwq(short[] sArr) {
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    public mwq(luk lukVar, pbb pbbVar) {
        this.b = lukVar;
        this.a = pbbVar.a("Settings");
    }

    public mwq(pat patVar, int i) {
        this.b = patVar;
        this.a = new ArrayDeque(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayDeque) this.a).addFirst(patVar.a());
        }
    }

    public mwq(pt ptVar, pbc pbcVar) {
        ptVar.getClass();
        this.b = ptVar;
        this.a = pbcVar.a("CameraPipeAudioRestrictApi");
    }

    public mwq(pt ptVar, pci pciVar) {
        ptVar.getClass();
        pciVar.getClass();
        this.b = ptVar;
        this.a = pciVar;
    }

    public mwq(pna pnaVar) {
        this.a = pnaVar;
        this.b = new phk(this);
    }

    public mwq(pbr pbrVar) {
        this.b = new AtomicInteger(0);
        this.a = pbrVar;
    }
}
