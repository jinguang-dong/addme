package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import com.google.android.libraries.vision.smartcapture.BurstCurator;
import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fqz implements paf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fqz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.paf
    public final void a(Object obj) {
        int i = 11;
        int i2 = 2;
        switch (this.b) {
            case 0:
                ServiceConnection serviceConnection = (ServiceConnection) obj;
                Object obj2 = this.a;
                try {
                    ((fra) obj2).c.f("unbindPhotosService");
                    Context context = ((fra) obj2).b;
                    rnt.x(serviceConnection);
                    context.unbindService(serviceConnection);
                    return;
                } finally {
                    ((fra) obj2).c.g();
                }
            case 1:
                ((fiv) ((iiz) this.a).b).c.a(juk.b);
                return;
            case 2:
                fxm fxmVar = (fxm) obj;
                fwi fwiVar = (fwi) this.a;
                fwiVar.f.a(juk.b);
                fyd fydVar = fwiVar.d;
                fydVar.k(false);
                fydVar.u.g();
                if (fxmVar != null) {
                    gds gdsVar = fxmVar.k;
                    gdsVar.b();
                    mhq mhqVar = gdsVar.a;
                    mhqVar.getClass();
                    gdsVar.l = mhqVar.d(gdsVar);
                    return;
                }
                return;
            case 3:
                rwc rwcVar = (rwc) obj;
                Object obj3 = this.a;
                gky gkyVar = (gky) obj3;
                gkyVar.a();
                if (rwcVar == null || !rwcVar.h()) {
                    gkyVar.j.l(gkyVar.d);
                    if (gkyVar.h() == 3) {
                        gkyVar.b();
                        return;
                    }
                    moo mooVar = gkyVar.b;
                    mooVar.a();
                    mooVar.h();
                    return;
                }
                nnd nndVar = (nnd) rwcVar.c();
                int i3 = nndVar.a;
                if (i3 != 8) {
                    if (i3 != 16) {
                        gkyVar.b.j();
                        gkyVar.h = gkyVar.f.schedule(new gku(obj3, 4), 150L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    return;
                }
                String str = nndVar.c;
                if (str != null) {
                    moo mooVar2 = gkyVar.b;
                    mooVar2.n(str);
                    mooVar2.k().setContentDescription(gkyVar.e);
                    mooVar2.k().setClickable(false);
                    return;
                }
                return;
            case 4:
                this.a.run();
                return;
            case 5:
                ((hti) this.a).f.a(juk.b);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    ((iry) this.a).s.d(luf.bc, true);
                    return;
                }
                return;
            case 7:
                iyu iyuVar = (iyu) this.a;
                if (iyuVar.y) {
                    iyuVar.y = false;
                    Handler handler = iyuVar.d;
                    hna hnaVar = (hna) iyuVar.n.a();
                    hnaVar.getClass();
                    handler.post(new hjp(hnaVar, 18));
                    return;
                }
                return;
            case 8:
                ((jbm) ((iiz) this.a).b).A.a(juk.b);
                return;
            case 9:
                ((jby) ((iiz) this.a).b).S.a(juk.b);
                return;
            case 10:
                ((jcm) ((fxw) this.a).a).m.a(juk.b);
                return;
            case 11:
                ((jcv) ((iiz) this.a).b).L.a(juk.b);
                return;
            case 12:
                hdt hdtVar = (hdt) this.a;
                srg srgVar = (srg) obj;
                if (!hdtVar.a || hdtVar.b || srgVar == null) {
                    return;
                }
                Optional optionalFindFirst = Collection.EL.stream(srgVar.d).filter(new fla(17)).findFirst();
                if (!optionalFindFirst.isPresent() || ((srf) optionalFindFirst.get()).g <= ((Integer) hdtVar.c.a(gzo.v).get()).intValue()) {
                    return;
                }
                cxb.I();
                return;
            case 13:
                if (((mgn) obj).a()) {
                    return;
                }
                jxa jxaVar = (jxa) this.a;
                jxaVar.Y.ac(jxaVar.J).show();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                BurstCurator burstCurator = (BurstCurator) obj;
                synchronized (this.a) {
                    if (burstCurator != null) {
                        burstCurator.close();
                    }
                }
                return;
            case 15:
                ((maq) this.a).o();
                return;
            case 16:
                Object obj4 = this.a;
                mau mauVar = ((maq) obj4).b;
                Boolean bool2 = (Boolean) obj;
                if (mauVar.n) {
                    return;
                }
                bool2.getClass();
                if (bool2.booleanValue()) {
                    mbf mbfVar = mauVar.p;
                    mbfVar.a();
                    szh szhVar = new szh();
                    int i4 = mbfVar.i;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i4 != 2 && mbfVar.e.fr() != null) {
                        mbfVar.i = 2;
                        throw null;
                    }
                    szhVar.e(Boolean.FALSE);
                    ojl.ck(szhVar, new fqz(obj4, 15), ojl.ce());
                    return;
                }
                return;
            case 17:
                mau mauVar2 = ((mar) this.a).b;
                Boolean bool3 = (Boolean) obj;
                if (mauVar2.n) {
                    return;
                }
                bool3.getClass();
                if (bool3.booleanValue()) {
                    mbf mbfVar2 = mauVar2.p;
                    mbfVar2.getClass();
                    mbfVar2.b(new man(mbfVar2, i2));
                    return;
                }
                return;
            case 18:
                mau mauVar3 = ((mas) this.a).b;
                Boolean bool4 = (Boolean) obj;
                if (mauVar3.n) {
                    return;
                }
                bool4.getClass();
                if (bool4.booleanValue()) {
                    mbf mbfVar3 = mauVar3.p;
                    mbfVar3.getClass();
                    mbfVar3.b(new iwh(i));
                    return;
                }
                return;
            case 19:
                rwc rwcVar2 = (rwc) obj;
                Object obj5 = this.a;
                if (rwcVar2 != null && rwcVar2.h()) {
                    nnd nndVar2 = (nnd) rwcVar2.c();
                    int i5 = nndVar2.a;
                    if (i5 == 8) {
                        String str2 = nndVar2.c;
                        str2.getClass();
                        ((mct) obj5).g(str2);
                        return;
                    } else if (i5 != 16) {
                        mct mctVar = (mct) obj5;
                        mctVar.b.j();
                        mctVar.e();
                        return;
                    }
                }
                mct mctVar2 = (mct) obj5;
                mwq mwqVar = mctVar2.g;
                Uri uri = mctVar2.c;
                mwqVar.l(uri);
                if (jsv.E(mctVar2.a) == 3) {
                    mwqVar.k(uri);
                    mctVar2.b.j();
                    mctVar2.e();
                    return;
                }
                return;
            default:
                rwc rwcVar3 = (rwc) obj;
                if (rwcVar3 == null || !rwcVar3.h()) {
                    return;
                }
                Object obj6 = this.a;
                nnd nndVar3 = (nnd) rwcVar3.c();
                int i6 = nndVar3.a;
                if (i6 == 8) {
                    String str3 = nndVar3.c;
                    str3.getClass();
                    ((mct) obj6).g(str3);
                    return;
                } else {
                    if (i6 == 16) {
                        mct mctVar3 = (mct) obj6;
                        mctVar3.g.l(mctVar3.c);
                        mctVar3.b.h();
                        return;
                    }
                    float f = nndVar3.b;
                    if (f > 0.0f) {
                        moj mojVar = ((mct) obj6).b;
                        mojVar.b.setIndeterminate(false);
                        mojVar.b.setProgress((int) (r0.getMax() * f));
                    }
                    mct mctVar4 = (mct) obj6;
                    mctVar4.d();
                    mctVar4.e = mctVar4.d.schedule(new man(obj6, i), 150L, TimeUnit.MILLISECONDS);
                    return;
                }
        }
    }
}
