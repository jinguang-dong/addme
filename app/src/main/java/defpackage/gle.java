package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gle implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final /* synthetic */ int m;

    public gle(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i) {
        this.m = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.m;
        if (i == 0) {
            return new gld((hbj) this.a.a(), (glu) this.b.a(), (glb) this.c.a(), (pnq) this.d.a(), (owf) this.e.a(), (owf) this.f.a(), (owq) this.g.a(), (glf) this.h.a(), (glf) this.i.a(), (luw) this.j.a(), (luw) this.k.a(), ((ims) this.l).b());
        }
        if (i == 1) {
            tzx tzxVar = this.k;
            Resources resourcesB = ((hoa) this.e).b();
            owf owfVar = (owf) tzxVar.a();
            fft fftVar = (fft) this.d.a();
            fgn fgnVar = (fgn) this.l.a();
            tzx tzxVar2 = this.h;
            return new fgx(resourcesB, owfVar, fftVar, fgnVar, ((imm) this.c).b(), (imi) tzxVar2.a(), (luj) this.f.a(), (luj) this.g.a(), ((ffw) this.b).a(), (owf) this.i.a(), (owq) this.j.a(), (gwx) this.a.a());
        }
        if (i != 2) {
            return new hup(((hsl) this.a).a(), new pql(), (hbj) this.i.a(), (syj) this.e.a(), (Executor) this.c.a(), (uhf) this.b.a(), (ktx) this.g.a(), (nnm) this.l.a(), (owf) this.j.a(), (owf) this.h.a(), (owf) this.k.a(), (owf) this.d.a(), (Optional) this.f.a());
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.l.a();
        ocq ocqVar = (ocq) this.j.a();
        tzx tzxVar3 = this.i;
        return new gmo(scheduledExecutorService, ocqVar, ((hoa) this.f).b(), (krj) tzxVar3.a(), (owf) this.k.a(), (owq) this.e.a(), (SharedPreferences) this.g.a(), (owf) this.c.a(), (owq) this.a.a(), ((ims) this.d).b(), (jtc) this.h.a(), (hbj) this.b.a());
    }

    public gle(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, byte[] bArr) {
        this.m = i;
        this.e = tzxVar;
        this.k = tzxVar2;
        this.d = tzxVar3;
        this.l = tzxVar4;
        this.c = tzxVar5;
        this.h = tzxVar6;
        this.f = tzxVar7;
        this.g = tzxVar8;
        this.b = tzxVar9;
        this.i = tzxVar10;
        this.j = tzxVar11;
        this.a = tzxVar12;
    }

    public gle(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, char[] cArr) {
        this.m = i;
        this.l = tzxVar;
        this.j = tzxVar2;
        this.f = tzxVar3;
        this.i = tzxVar4;
        this.k = tzxVar5;
        this.e = tzxVar6;
        this.g = tzxVar7;
        this.c = tzxVar8;
        this.a = tzxVar9;
        this.d = tzxVar10;
        this.h = tzxVar11;
        this.b = tzxVar12;
    }

    public gle(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, short[] sArr) {
        this.m = i;
        this.a = tzxVar;
        this.i = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
        this.g = tzxVar6;
        this.l = tzxVar7;
        this.j = tzxVar8;
        this.h = tzxVar9;
        this.k = tzxVar10;
        this.d = tzxVar11;
        this.f = tzxVar12;
    }
}
