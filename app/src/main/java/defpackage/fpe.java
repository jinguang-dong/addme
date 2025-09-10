package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import com.google.android.apps.camera.bottombar.BottomBar;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fpe implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fpe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        Optional optionalOfNullable;
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                hyn hynVar = new hyn(i);
                fpo fpoVar = (fpo) this.a;
                fpoVar.b.a((fpa) DesugarAtomicReference.updateAndGet(fpoVar.h, hynVar));
                fpoVar.i = fpoVar.e.a();
                fpoVar.c.b();
                fpoVar.d.b();
                return;
            case 1:
                fpa fpaVar = (fpa) obj;
                Object obj2 = this.a;
                if (fpaVar == fpa.TRACKING) {
                    fly flyVar = (fly) obj2;
                    flyVar.a();
                    flyVar.c();
                    return;
                } else {
                    if (fpaVar == fpa.NOT_RELIABLE_MISSING_MAP) {
                        ((fly) obj2).c();
                        return;
                    }
                    return;
                }
            case 2:
                List list = (List) obj;
                if (((nkw) list.get(0)) != nkw.COTTAGE) {
                    optionalOfNullable = Optional.empty();
                } else {
                    fpa fpaVar2 = (fpa) list.get(1);
                    Boolean bool = (Boolean) list.get(2);
                    bool.getClass();
                    optionalOfNullable = (!bool.booleanValue() || fpaVar2 == fpa.TRACKING) ? Optional.ofNullable((Integer) fpl.a.get(fpaVar2)) : Optional.ofNullable((Integer) fpl.a.get(fpa.NOT_RELIABLE_TOO_FEW_LANDMARKS));
                }
                Object obj3 = this.a;
                if (optionalOfNullable.isPresent()) {
                    ((fpl) obj3).b.a(Optional.of(new fpj(((Integer) optionalOfNullable.get()).intValue(), (fpa) list.get(1))));
                    return;
                } else {
                    ((fpl) obj3).b.a(Optional.empty());
                    return;
                }
            case 3:
                ((fpl) this.a).d((Optional) obj);
                return;
            case 4:
                Object obj4 = this.a;
                fts ftsVar = (fts) obj4;
                int i2 = ftsVar.b;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 2) {
                    ftsVar.a.execute(new foh(obj4, 6));
                    return;
                }
                return;
            case 5:
                ((ftv) this.a).i(((Boolean) obj).booleanValue());
                return;
            case 6:
                Boolean bool2 = (Boolean) obj;
                ftv ftvVar = (ftv) this.a;
                if (ftvVar.o) {
                    return;
                }
                if (bool2.booleanValue()) {
                    ftvVar.s.m(mtp.ASTRO, mtq.ENABLED);
                    return;
                } else {
                    ftvVar.s.m(mtp.ASTRO, mtq.INACTIVE);
                    return;
                }
            case 7:
                Duration duration = (Duration) obj;
                Optional optionalOf = Optional.of(duration);
                ftv ftvVar2 = (ftv) this.a;
                ftvVar2.f.a(optionalOf);
                ftvVar2.l(duration);
                return;
            case 8:
                List list2 = (List) obj;
                boolean zBooleanValue = ((Boolean) list2.get(0)).booleanValue();
                boolean zBooleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                ftv ftvVar3 = (ftv) this.a;
                ftvVar3.a.a(Boolean.valueOf(z));
                ftvVar3.o(zBooleanValue, zBooleanValue2);
                return;
            case 9:
                ((ftv) this.a).n();
                return;
            case 10:
                ftv ftvVar4 = (ftv) this.a;
                ftvVar4.c.a(Boolean.valueOf(ftv.q((kox) obj, (ltw) ftvVar4.e.dL(), (jjq) ftvVar4.i.dL(), ftvVar4.v.aa())));
                return;
            case 11:
                ((ftv) this.a).p();
                return;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((ftv) this.a).e();
                return;
            case 13:
                Boolean bool3 = (Boolean) obj;
                BaseCurator baseCurator = ((fuj) this.a).l;
                if (baseCurator != null) {
                    baseCurator.b(bool3.booleanValue());
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((BottomBar) this.a).u();
                return;
            case 15:
                ((fyl) this.a).c();
                return;
            case 16:
                if (((ltv) obj).equals(ltv.ON)) {
                    fzb fzbVar = (fzb) this.a;
                    if (fzbVar.i.h()) {
                        fzbVar.c((mcg) fzbVar.i.c());
                        return;
                    }
                    return;
                }
                return;
            case 17:
                if (((gas) obj) == gas.ERROR) {
                    gav gavVar = (gav) this.a;
                    gavVar.a.O(false);
                    gavVar.b.c(nau.CAPTURE_SESSION_ERROR);
                    return;
                }
                return;
            case 18:
                this.a.a((Boolean) obj);
                return;
            case 19:
                this.a.a(true);
                return;
            default:
                pey peyVar = (pey) pfu.v();
                peyVar.f = (Integer) obj;
                ((pfu) this.a).r(new pex(peyVar));
                return;
        }
    }
}
