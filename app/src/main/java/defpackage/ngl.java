package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngl implements tzt {
    private final tzx a;

    public ngl(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AmbientMode.AmbientController a() {
        return new AmbientMode.AmbientController((owf) this.a.a(), null);
    }
}
