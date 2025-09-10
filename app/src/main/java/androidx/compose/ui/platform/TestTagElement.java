package androidx.compose.ui.platform;

import defpackage.a;
import defpackage.bij;
import defpackage.bwa;
import defpackage.bzx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TestTagElement extends bwa {
    private final String a;

    public TestTagElement(String str) {
        this.a = str;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bzx(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bzx) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return a.ao(this.a, ((TestTagElement) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
