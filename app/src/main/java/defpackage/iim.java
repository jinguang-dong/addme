package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iim implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public iim(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iil a() {
        return new iil(((iin) this.a).a(), (lsp) this.b.a(), (Executor) this.c.a());
    }
}
