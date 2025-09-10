package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvk implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public qvk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qvj a() {
        Context contextB = ((imm) this.a).b();
        return new qvj(contextB, this.c);
    }
}
