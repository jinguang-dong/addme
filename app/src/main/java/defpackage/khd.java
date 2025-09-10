package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khd implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public khd(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        if (this.f != 0) {
            return new kdz(((hoa) this.e).b(), (jtc) this.c.a(), (ScheduledExecutorService) this.b.a(), (hyh) this.a.a(), (ocq) this.d.a());
        }
        our ourVar = (our) this.a.a();
        our ourVar2 = (our) this.b.a();
        khb khbVar = new khb(((hco) this.c).a(), (pbn) this.d.a(), (out) this.e.a());
        ourVar.d(new iew(khbVar, 20));
        ourVar2.d(new khc(khbVar, 1));
        return khbVar;
    }

    public khd(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
    }
}
