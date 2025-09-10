package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epj extends ezk implements Cloneable {
    private Object A;
    private List B;
    private epj C;
    private epj D;
    private Float E;
    private boolean F = true;
    private boolean G;
    private boolean H;
    private final Context v;
    private final epl w;
    private final Class x;
    private final epa y;
    private epm z;

    static {
    }

    protected epj(eox eoxVar, epl eplVar, Class cls, Context context) {
        this.w = eplVar;
        this.x = cls;
        this.v = context;
        epa epaVar = eplVar.a.b;
        epm epmVar = (epm) epaVar.c.get(cls);
        if (epmVar == null) {
            for (Map.Entry entry : epaVar.c.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    epmVar = (epm) entry.getValue();
                }
            }
        }
        this.z = epmVar == null ? epa.a : epmVar;
        this.y = eoxVar.b;
        Iterator it = eplVar.d.iterator();
        while (it.hasNext()) {
            a((ezr) it.next());
        }
        f(eplVar.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ezn M(Object obj, faa faaVar, ezr ezrVar, ezp ezpVar, epm epmVar, epb epbVar, int i, int i2, ezk ezkVar, Executor executor) {
        ezp ezpVar2;
        ezp ezlVar;
        ezn eznVarN;
        epb epbVar2;
        epj epjVar = this;
        ezk ezkVar2 = ezkVar;
        if (epjVar.D != null) {
            ezlVar = new ezl(obj, ezpVar);
            ezpVar2 = ezlVar;
        } else {
            ezpVar2 = null;
            ezlVar = ezpVar;
        }
        epj epjVar2 = epjVar.C;
        if (epjVar2 == null) {
            eznVarN = epjVar.N(obj, faaVar, ezrVar, ezkVar2, ezlVar, epmVar, epbVar, i, i2, executor);
        } else {
            if (epjVar.H) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            epm epmVar2 = true == epjVar2.F ? epmVar : epjVar2.z;
            if (super.B(8)) {
                epbVar2 = epjVar2.c;
            } else {
                int i3 = epi.b[epbVar.ordinal()];
                if (i3 == 1) {
                    epbVar2 = epb.NORMAL;
                } else if (i3 == 2) {
                    epbVar2 = epb.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(epjVar.c))));
                    }
                    epbVar2 = epb.IMMEDIATE;
                }
            }
            epb epbVar3 = epbVar2;
            epj epjVar3 = epjVar.C;
            int i4 = epjVar3.i;
            int i5 = epjVar3.h;
            if (fax.l(i, i2) && !epjVar.C.C()) {
                i4 = ezkVar2.i;
                i5 = ezkVar2.h;
            }
            int i6 = i5;
            ezu ezuVar = new ezu(obj, ezlVar);
            ezn eznVarN2 = epjVar.N(obj, faaVar, ezrVar, ezkVar2, ezuVar, epmVar, epbVar, i, i2, executor);
            epjVar.H = true;
            epj epjVar4 = epjVar.C;
            ezn eznVarM = epjVar4.M(obj, faaVar, ezrVar, ezuVar, epmVar2, epbVar3, i4, i6, epjVar4, executor);
            ezu ezuVar2 = ezuVar;
            epjVar.H = false;
            ezuVar2.a = eznVarN2;
            ezuVar2.b = eznVarM;
            ezkVar2 = ezkVar;
            epjVar = epjVar;
            eznVarN = ezuVar2;
        }
        ezn eznVar = eznVarN;
        if (ezpVar2 == null) {
            return eznVar;
        }
        epj epjVar5 = epjVar.D;
        int i7 = epjVar5.i;
        int i8 = epjVar5.h;
        if (fax.l(i, i2) && !epjVar.D.C()) {
            i7 = ezkVar2.i;
            i8 = ezkVar2.h;
        }
        epj epjVar6 = epjVar.D;
        ezl ezlVar2 = ezpVar2;
        ezn eznVarM2 = epjVar6.M(obj, faaVar, ezrVar, ezlVar2, epjVar6.z, epjVar6.c, i7, i8, epjVar6, executor);
        ezlVar2.a = eznVar;
        ezlVar2.b = eznVarM2;
        return ezlVar2;
    }

    private final ezn N(Object obj, faa faaVar, ezr ezrVar, ezk ezkVar, ezp ezpVar, epm epmVar, epb epbVar, int i, int i2, Executor executor) {
        Object obj2 = this.A;
        List list = this.B;
        ezh ezhVar = epmVar.a;
        Context context = this.v;
        Class cls = this.x;
        epa epaVar = this.y;
        return new ezt(context, epaVar, obj, obj2, cls, ezkVar, i, i2, epbVar, faaVar, ezrVar, list, ezpVar, epaVar.h, executor);
    }

    public final epj a(ezr ezrVar) {
        if (this.r) {
            return clone().a(ezrVar);
        }
        if (ezrVar != null) {
            if (this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(ezrVar);
        }
        L();
        return this;
    }

    @Override // defpackage.ezk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final epj f(ezk ezkVar) {
        eoz.k(ezkVar);
        return (epj) super.f(ezkVar);
    }

    @Override // defpackage.ezk
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final epj clone() {
        epj epjVar = (epj) super.clone();
        epjVar.z = epjVar.z.clone();
        List list = epjVar.B;
        if (list != null) {
            epjVar.B = new ArrayList(list);
        }
        epj epjVar2 = epjVar.C;
        if (epjVar2 != null) {
            epjVar.C = epjVar2.clone();
        }
        epj epjVar3 = epjVar.D;
        if (epjVar3 != null) {
            epjVar.D = epjVar3.clone();
        }
        return epjVar;
    }

    public final epj d(Uri uri) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        epj epjVarE = e(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return epjVarE;
        }
        Context context = this.v;
        epj epjVar = (epj) epjVarE.w(context.getTheme());
        ConcurrentMap concurrentMap = faf.a;
        String packageName = context.getPackageName();
        eqi eqiVar = (eqi) faf.a.get(packageName);
        if (eqiVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            fai faiVar = new fai(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            eqiVar = (eqi) faf.a.putIfAbsent(packageName, faiVar);
            if (eqiVar == null) {
                eqiVar = faiVar;
            }
        }
        return (epj) epjVar.v(new fae(context.getResources().getConfiguration().uiMode & 48, eqiVar));
    }

    public final epj e(Object obj) {
        if (this.r) {
            return clone().e(obj);
        }
        this.A = obj;
        this.G = true;
        L();
        return this;
    }

    @Override // defpackage.ezk
    public final boolean equals(Object obj) {
        if (obj instanceof epj) {
            epj epjVar = (epj) obj;
            if (super.equals(epjVar) && Objects.equals(this.x, epjVar.x) && this.z.equals(epjVar.z) && Objects.equals(this.A, epjVar.A) && Objects.equals(this.B, epjVar.B) && Objects.equals(this.C, epjVar.C) && Objects.equals(this.D, epjVar.D)) {
                Float f = epjVar.E;
                if (Objects.equals(null, null) && this.F == epjVar.F && this.G == epjVar.G) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ezq h() {
        ezq ezqVar = new ezq();
        j(ezqVar, ezqVar, this, fap.b);
        return ezqVar;
    }

    @Override // defpackage.ezk
    public final int hashCode() {
        return fax.c(this.G ? 1 : 0, fax.c(this.F ? 1 : 0, fax.d(null, fax.d(this.D, fax.d(this.C, fax.d(this.B, fax.d(this.A, fax.d(this.z, fax.d(this.x, super.hashCode())))))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.fax.g()
            defpackage.eoz.k(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.B(r0)
            if (r0 != 0) goto L5a
            boolean r0 = r3.l
            if (r0 == 0) goto L5a
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L5a
            int[] r0 = defpackage.epi.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L41;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            epj r0 = r3.clone()
            ezk r0 = r0.o()
            goto L5b
        L31:
            epj r0 = r3.clone()
            ewu r1 = defpackage.ewu.b
            exc r2 = new exc
            r2.<init>()
            ezk r0 = super.p(r1, r2)
            goto L5b
        L41:
            epj r0 = r3.clone()
            ezk r0 = r0.o()
            goto L5b
        L4a:
            epj r0 = r3.clone()
            ewu r1 = defpackage.ewu.d
            ewi r2 = new ewi
            r2.<init>()
            ezk r0 = r0.q(r1, r2)
            goto L5b
        L5a:
            r0 = r3
        L5b:
            epa r1 = r3.y
            java.lang.Class r2 = r3.x
            ezh r1 = r1.f
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6f
            ezw r1 = new ezw
            r1.<init>(r4)
            goto L7c
        L6f:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L83
            ezy r1 = new ezy
            r1.<init>(r4)
        L7c:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.fap.a
            r3.j(r1, r4, r0, r2)
            return
        L83:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unhandled class: "
            java.lang.String r0 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r4 = defpackage.a.bx(r2, r4, r0)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epj.i(android.widget.ImageView):void");
    }

    public final void j(faa faaVar, ezr ezrVar, ezk ezkVar, Executor executor) {
        eoz.k(faaVar);
        if (!this.G) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        ezn eznVarM = M(new Object(), faaVar, ezrVar, null, this.z, ezkVar.c, ezkVar.i, ezkVar.h, ezkVar, executor);
        ezn eznVarA = faaVar.a();
        if (!eznVarM.m(eznVarA) || (!ezkVar.g && eznVarA.l())) {
            epl eplVar = this.w;
            eplVar.e(faaVar);
            faaVar.e(eznVarM);
            eplVar.l(faaVar, eznVarM);
            return;
        }
        eoz.k(eznVarA);
        if (eznVarA.n()) {
            return;
        }
        eznVarA.b();
    }
}
