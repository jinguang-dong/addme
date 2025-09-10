package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.amh;
import defpackage.bid;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VerticalAlignElement extends bwa {
    private final bid a;

    public VerticalAlignElement(bid bidVar) {
        this.a = bidVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new amh(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((amh) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return a.ao(this.a, verticalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
