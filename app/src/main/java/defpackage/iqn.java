package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqn implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public iqn(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            return ((hbj) this.a.a()).p(gza.g) ? Optional.of((iqv) this.b.a()) : Optional.empty();
        }
        if (i == 1) {
            return new hkk(((imq) this.a).a(), (out) this.b.a());
        }
        if (i != 2) {
            return ((hbj) this.a.a()).p(gza.g) ? rwc.j((iru) this.b.a()) : rvk.a;
        }
        return ((hbj) this.a.a()).p(gza.g) ? Optional.of((iry) this.b.a()) : Optional.empty();
    }
}
