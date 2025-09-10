package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.alv;
import defpackage.alx;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaddingValuesElement extends bwa {
    private final alv a;

    public PaddingValuesElement(alv alvVar) {
        this.a = alvVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alx(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((alx) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return a.ao(this.a, paddingValuesElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
