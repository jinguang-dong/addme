package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqy implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public hqy(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hqx a() {
        ContentResolver contentResolverB = ((imv) this.a).b();
        mfs mfsVar = (mfs) this.b.a();
        pbn pbnVar = (pbn) this.c.a();
        return new hqx(contentResolverB, mfsVar, pbnVar);
    }
}
