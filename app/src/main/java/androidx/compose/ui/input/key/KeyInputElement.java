package androidx.compose.ui.input.key;

import defpackage.bij;
import defpackage.bow;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends bwa {
    private final uiq a;
    private final uiq b = null;

    public KeyInputElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bow(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bow) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (this.a != keyInputElement.a) {
            return false;
        }
        uiq uiqVar = keyInputElement.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
