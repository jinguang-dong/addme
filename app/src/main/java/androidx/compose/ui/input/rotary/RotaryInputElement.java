package androidx.compose.ui.input.rotary;

import defpackage.bij;
import defpackage.bqq;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends bwa {
    private final uiq a;
    private final uiq b = null;

    public RotaryInputElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bqq(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((bqq) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (this.a != rotaryInputElement.a) {
            return false;
        }
        uiq uiqVar = rotaryInputElement.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
