package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffn implements tzt {
    private final tzx a;
    private final tzx b;

    public ffn(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AmbientDelegate a() {
        return new AmbientDelegate(((ffo) this.a).a(), (hbj) this.b.a());
    }
}
