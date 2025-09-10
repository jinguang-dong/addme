package androidx.compose.ui.semantics;

import defpackage.bij;
import defpackage.bwa;
import defpackage.cbg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends bwa {
    private final cbg a;

    public EmptySemanticsElement(cbg cbgVar) {
        this.a = cbgVar;
    }

    @Override // defpackage.bwa
    public final /* synthetic */ bij a() {
        return this.a;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
