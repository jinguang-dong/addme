package androidx.compose.ui.layout;

import defpackage.bij;
import defpackage.bsx;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends bwa {
    private final uiq a;

    public OnGloballyPositionedElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bsx(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bsx) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
