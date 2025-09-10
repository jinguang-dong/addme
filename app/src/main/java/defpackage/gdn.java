package defpackage;

import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdn implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public gdn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gdm a() {
        return new gdm((mua) this.a.a(), (nqp) this.c.a(), (out) this.b.a(), new rwu(rvj.a), new Timer());
    }
}
