package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Pair;
import androidx.wear.ambient.AmbientDelegate;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mau implements mam, jhh {
    private final Context a;
    private final mah b;
    public final Resources g;
    public final mav h;
    public final Handler i;
    public final mal j;
    public final Runnable k;
    public final may l;
    public fqb m;
    public boolean n;
    public final hbw o;
    public final mbf p;
    public final AmbientDelegate q;

    public mau(Context context, mav mavVar, AmbientDelegate ambientDelegate, hbw hbwVar, mah mahVar, Handler handler, Resources resources, may mayVar, mal malVar, mbf mbfVar) {
        this.a = context;
        this.h = mavVar;
        this.q = ambientDelegate;
        this.o = hbwVar;
        this.b = mahVar;
        this.i = handler;
        this.l = mayVar;
        this.j = malVar;
        this.p = mbfVar;
        Integer.toHexString(hashCode());
        this.k = new man(this, 0);
        this.g = resources;
    }

    public final syu o(fqb fqbVar) {
        String strB = mah.b(mah.a(fqbVar));
        mah mahVar = this.b;
        mba mbaVar = mahVar.a;
        List listB = mbaVar.b("image/*");
        List listB2 = mbaVar.b("video/*");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(listB);
        arrayList2.addAll(listB2);
        int i = 0;
        mbaVar.g();
        boolean zD = mah.d(strB);
        boolean zE = mah.e(strB);
        mbg mbgVarA = mbh.a();
        mbgVarA.d(zD);
        int i2 = 9;
        Iterable$EL.forEach(listB, new glw(mahVar, arrayList, mbgVarA, i2));
        mbgVarA.d(zE);
        Iterable$EL.forEach(listB2, new glw(mahVar, arrayList, mbgVarA, 10));
        final ArrayList arrayList3 = (ArrayList) Collection.EL.stream(arrayList).sorted(new aod(mahVar, i2, null)).filter(mah.c(new maf(1))).collect(Collectors.toCollection(new mae(i)));
        if (mahVar.e.p(gzo.aM)) {
            Optional optionalFindFirst = Collection.EL.stream(mbaVar.c(strB)).filter(new jjj(mahVar, 19)).findFirst();
            if (optionalFindFirst.isPresent()) {
                mbg mbgVarA2 = mbh.a();
                mbgVarA2.c((ResolveInfo) optionalFindFirst.get());
                mbgVarA2.e();
                mbgVarA2.d(true);
                mbgVarA2.b(true);
                arrayList3.add(mbgVarA2.a());
            }
        }
        mbg mbgVarA3 = mbh.a();
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        Collection.EL.stream(arrayList3).forEachOrdered(new ldn(atomicInteger, atomicInteger2, 3));
        int i3 = 2;
        mbgVarA3.c((atomicInteger.get() >= 3 || atomicInteger2.get() <= 0) ? mahVar.f(3) : mahVar.f(2));
        mbgVarA3.e();
        mbgVarA3.d(true);
        arrayList3.add(mbgVarA3.a());
        Collection.EL.removeIf(arrayList3, new hzk(20));
        List<ResolveInfo> list = (List) Collection.EL.stream(arrayList3).map(new maf(i3)).collect(Collectors.toList());
        mal malVar = this.j;
        Context context = this.a;
        rnt.L(malVar.a);
        luj lujVar = malVar.b;
        lur lurVar = luf.ai;
        if (!((Boolean) lujVar.b(lurVar)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(context.getPackageName());
            arrayList4.addAll(maz.c);
            ArrayList arrayList5 = new ArrayList();
            for (ResolveInfo resolveInfo : list) {
                if (!arrayList4.contains(resolveInfo.activityInfo.packageName)) {
                    arrayList5.add(resolveInfo);
                }
            }
            if (!arrayList5.isEmpty()) {
                malVar.c.d(lurVar, true);
            }
        }
        final mbf mbfVar = this.p;
        final szh szhVar = new szh();
        int i4 = mbfVar.i;
        if (i4 == 0) {
            throw null;
        }
        if (i4 != 1) {
            szhVar.e(true);
            return szhVar;
        }
        final szh szhVar2 = new szh();
        mbfVar.d.execute(mbfVar.f.c("ssui", new Runnable() { // from class: mbd
            @Override // java.lang.Runnable
            public final void run() {
                Drawable drawableLoadIcon;
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = arrayList3;
                int size = arrayList7.size();
                for (int i5 = 0; i5 < size; i5++) {
                    mbf mbfVar2 = mbfVar;
                    mbh mbhVar = (mbh) arrayList7.get(i5);
                    if (mbfVar2.c()) {
                        break;
                    }
                    if (mbfVar2.a) {
                        drawableLoadIcon = mbfVar2.b.getDrawable(R.drawable.social_app_security_icon);
                        drawableLoadIcon.getClass();
                    } else {
                        drawableLoadIcon = mbhVar.a.loadIcon(mbfVar2.b.getPackageManager());
                    }
                    arrayList6.add(new Pair(mbhVar, drawableLoadIcon));
                }
                szhVar2.e(arrayList6);
            }
        }));
        ojl.ck(szhVar2, new paf() { // from class: mbe
            @Override // defpackage.paf
            public final void a(Object obj) {
                szh szhVar3 = szhVar;
                mbf mbfVar2 = mbfVar;
                ArrayList arrayList6 = (ArrayList) obj;
                if (mbfVar2.c()) {
                    szhVar3.e(false);
                    return;
                }
                int i5 = mbfVar2.i;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 != 1) {
                    szhVar3.e(true);
                } else if (arrayList6 != null) {
                    throw null;
                }
            }
        }, ojl.ce());
        return szhVar;
    }

    public final void p(boolean z, boolean z2) {
        mbf mbfVar = this.p;
        int i = mbfVar.i;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            mbfVar.i = 1;
            mbfVar.c.i = false;
            if (!z) {
                throw null;
            }
            int i2 = sbp.d;
            new sbk();
            throw null;
        }
        this.q.s();
        this.n = true;
        this.m = null;
        mal malVar = this.j;
        if (malVar.a) {
            malVar.c();
        }
        if (z2) {
            may mayVar = this.l;
            mayVar.a();
            mayVar.b();
        }
    }

    @Override // defpackage.mam, defpackage.jfs
    public /* synthetic */ boolean r() {
        return false;
    }

    public /* synthetic */ void a() {
    }

    public /* synthetic */ void b() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void d() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void e() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void eT() {
    }

    @Override // defpackage.mam, defpackage.jhe
    public /* synthetic */ void eb() {
    }

    public /* synthetic */ void g() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void j() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void k() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void l() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void m() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void n() {
    }

    @Override // defpackage.mam
    public /* synthetic */ void f(fqb fqbVar) {
    }

    @Override // defpackage.mam
    public /* synthetic */ void h(fqb fqbVar) {
    }
}
