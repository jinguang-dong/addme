package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzz {
    private static final sgv a = sgv.g("kzz");

    public static sbp a(pjo pjoVar) {
        Iterator it = pjoVar.B().iterator();
        while (it.hasNext()) {
            String name = ((CaptureRequest.Key) it.next()).getName();
            CaptureRequest.Key key = kgx.a;
            if (name.equals(key.getName())) {
                return sbp.l(new pej(key, 1));
            }
        }
        int i = sbp.d;
        return sex.a;
    }

    public static sbp b(jwe jweVar, Location location) {
        int i = sbp.d;
        sbk sbkVar = new sbk();
        Optional optional = jweVar.a;
        if (!optional.isPresent()) {
            ((sgt) a.b().M(3881)).s("Camera framework flag for horizontal accuracy radius was not found.");
        } else if (location.hasAccuracy()) {
            sbkVar.h(new pej((CaptureRequest.Key) optional.get(), Float.valueOf(location.getAccuracy())));
        }
        Optional optional2 = jweVar.b;
        if (optional2.isPresent()) {
            sbkVar.h(new pej((CaptureRequest.Key) optional2.get(), new double[]{location.getLatitude(), location.getLongitude()}));
        } else {
            ((sgt) a.b().M(3882)).s("Camera framework flag for latitude and longitude was not found.");
        }
        Optional optional3 = jweVar.c;
        if (!optional3.isPresent()) {
            ((sgt) a.b().M(3883)).s("Camera framework flag for mean sea level altitude accuracy was not found.");
        } else if (location.hasMslAltitudeAccuracy()) {
            sbkVar.h(new pej((CaptureRequest.Key) optional3.get(), Float.valueOf(location.getMslAltitudeAccuracyMeters())));
        }
        Optional optional4 = jweVar.d;
        if (!optional4.isPresent()) {
            ((sgt) a.b().M(3884)).s("Camera framework flag for mean sea level altitude was not found.");
        } else if (location.hasMslAltitude()) {
            sbkVar.h(new pej((CaptureRequest.Key) optional4.get(), Double.valueOf(location.getMslAltitudeMeters())));
        }
        return sbkVar.g();
    }

    public static scn c(kit kitVar) {
        return scn.F(kitVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.scn d(defpackage.nkw r6, boolean r7, boolean r8, boolean r9, defpackage.jwj r10) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            j$.util.Optional r1 = r10.a
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto Lb8
            j$.util.Optional r2 = r10.e
            nkw r3 = defpackage.nkw.UNINITIALIZED
            int r6 = r6.ordinal()
            r3 = 1
            if (r6 == r3) goto L82
            r4 = 3
            if (r6 == r4) goto L71
            r5 = 6
            if (r6 == r5) goto L94
            r4 = 10
            if (r6 == r4) goto L6f
            r4 = 11
            if (r6 == r4) goto L4b
            r4 = 103(0x67, float:1.44E-43)
            switch(r6) {
                case 15: goto L3c;
                case 16: goto L2d;
                case 17: goto L71;
                default: goto L2b;
            }
        L2b:
            goto Lb5
        L2d:
            if (r7 == 0) goto L82
            r2.isPresent()
            java.lang.Object r6 = r2.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            goto L94
        L3c:
            if (r7 == 0) goto L82
            r2.isPresent()
            java.lang.Object r6 = r2.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            goto L94
        L4b:
            if (r9 == 0) goto L5e
            j$.util.Optional r6 = r10.c
            r6.isPresent()
            java.lang.Object r6 = r6.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r4 = 104(0x68, float:1.46E-43)
            goto L94
        L5e:
            j$.util.Optional r6 = r10.b
            r6.isPresent()
            java.lang.Object r6 = r6.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r4 = 100
            goto L94
        L6f:
            r4 = 5
            goto L94
        L71:
            j$.util.Optional r6 = r10.d
            r6.isPresent()
            java.lang.Object r6 = r6.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r4 = 101(0x65, float:1.42E-43)
            goto L94
        L82:
            if (r8 == 0) goto Lb5
            j$.util.Optional r6 = r10.f
            r6.isPresent()
            java.lang.Object r6 = r6.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r4 = 105(0x69, float:1.47E-43)
        L94:
            java.lang.Object r6 = r1.get()
            android.hardware.camera2.CaptureRequest$Key r6 = (android.hardware.camera2.CaptureRequest.Key) r6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            pej r8 = new pej
            r8.<init>(r6, r7)
            r0.add(r8)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            pej r8 = new pej
            r8.<init>(r6, r7)
            r0.add(r8)
            goto Lb8
        Lb5:
            sfd r6 = defpackage.sfd.a
            return r6
        Lb8:
            scn r6 = defpackage.scn.F(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzz.d(nkw, boolean, boolean, boolean, jwj):scn");
    }

    public static scn e(nkw nkwVar, pjo pjoVar, jwj jwjVar) {
        return l(nkwVar, pjoVar, false, jwjVar);
    }

    public static void f(Set set, pds pdsVar, pjo pjoVar) {
        if (set.isEmpty()) {
            return;
        }
        Set setB = pjoVar.B();
        scl sclVar = new scl();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            sclVar.d(((CaptureRequest.Key) it.next()).getName());
        }
        scn scnVarG = sclVar.g();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            pej pejVar = (pej) it2.next();
            if (scnVarG.contains(pejVar.a.getName())) {
                pdsVar.b().d(pejVar);
            }
        }
    }

    public static boolean g(CaptureRequest.Key key, pjo pjoVar) {
        Iterator it = pjoVar.A().iterator();
        while (it.hasNext()) {
            if (((CaptureRequest.Key) it.next()).getName().equals(key.getName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(peo peoVar) {
        long jA = peoVar.a();
        return jA == 257 || jA == 4098 || jA == 4099;
    }

    public static boolean i(peo peoVar) {
        long jA = peoVar.a();
        return jA == 37 || jA == 38;
    }

    public static boolean j(CaptureRequest.Key key, pjo pjoVar) {
        Iterator it = pjoVar.B().iterator();
        while (it.hasNext()) {
            if (((CaptureRequest.Key) it.next()).getName().equals(key.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void k(pfu pfuVar, pdn pdnVar) {
        Iterator it = pdnVar.i().d().iterator();
        while (it.hasNext()) {
            pfuVar.h((peo) it.next());
        }
    }

    public static scn l(nkw nkwVar, pjo pjoVar, boolean z, jwj jwjVar) {
        scl sclVar = new scl();
        sclVar.j(a(pjoVar));
        sclVar.j(d(nkwVar, false, false, z, jwjVar));
        return sclVar.g();
    }

    public static boolean m(hbj hbjVar, nkw nkwVar, boolean z) {
        if (!hbjVar.p(gza.a) || n(hbjVar, nkwVar)) {
            return false;
        }
        return (z && nkwVar.equals(nkw.PHOTO)) ? false : true;
    }

    public static boolean n(hbj hbjVar, nkw nkwVar) {
        return nkwVar.equals(nkw.PHOTO) && hbjVar.p(hae.y);
    }

    public static kgw o(pjr pjrVar, pjp pjpVar, kgn kgnVar, hbj hbjVar) {
        return p(pjrVar, pjpVar, kgnVar, hbjVar, nkw.UNINITIALIZED, false);
    }

    public static kgw p(pjr pjrVar, pjp pjpVar, kgn kgnVar, hbj hbjVar, nkw nkwVar, boolean z) {
        pjo pjoVarA = pjpVar.a(pjrVar);
        if (pjoVarA.l() == pka.FRONT) {
            if (hbjVar.p(gzo.ab)) {
                Iterator it = ((pjn) pjoVarA).b.iterator();
                while (it.hasNext()) {
                    pjo pjoVarA2 = pjpVar.a((pjr) it.next());
                    if (pjoVarA2.i().width() > pjoVarA.i().width()) {
                        pjoVarA = pjoVarA2;
                    }
                }
                pjoVarA = new kgw(pjoVarA);
            } else if (m(hbjVar, nkwVar, z)) {
                pjr pjrVarA = kgnVar.a();
                if (pjrVarA == null) {
                    pjrVarA = ((pjn) pjoVarA).a;
                }
                pjoVarA = new kgw(pjpVar.a(pjrVarA));
            }
        }
        return new kgw(pjoVarA);
    }
}
