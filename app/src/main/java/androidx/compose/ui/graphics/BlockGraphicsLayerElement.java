package androidx.compose.ui.graphics;

import defpackage.bij;
import defpackage.bkr;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends bwa {
    private final uiq a;

    public BlockGraphicsLayerElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bkr(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        bkr bkrVar = (bkr) bijVar;
        bkrVar.a = this.a;
        bkrVar.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.a == ((BlockGraphicsLayerElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
