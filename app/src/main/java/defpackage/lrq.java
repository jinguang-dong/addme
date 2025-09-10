package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrq implements tzt {
    private final tzx a;

    public lrq(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File a() {
        File cacheDir = ((imm) this.a).b().getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }
}
