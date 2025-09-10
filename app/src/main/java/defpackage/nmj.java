package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmj implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;

    public nmj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nmi a() throws PackageManager.NameNotFoundException {
        return new nmi(this.a, this.b, (luj) this.c.a(), (luj) this.d.a(), ((nmz) this.e).a(), (out) this.f.a(), ((ixv) this.g).a(), (mdy) this.h.a());
    }
}
