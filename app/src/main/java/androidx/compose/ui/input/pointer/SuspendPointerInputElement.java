package androidx.compose.ui.input.pointer;

import defpackage.a;
import defpackage.bij;
import defpackage.bql;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends bwa {
    private final Object a;
    private final Object b;
    private final Object[] d;
    private final PointerInputEventHandler e;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        this.a = 1 == (i & 1) ? null : obj;
        this.b = (i & 2) != 0 ? null : obj2;
        this.d = null;
        this.e = pointerInputEventHandler;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bql(this.a, this.b, this.e);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        bql bqlVar = (bql) bijVar;
        Object obj = bqlVar.a;
        Object obj2 = this.a;
        boolean z = !a.ao(obj, obj2);
        bqlVar.a = obj2;
        Object obj3 = bqlVar.b;
        Object obj4 = this.b;
        boolean z2 = !a.ao(obj3, obj4);
        bqlVar.b = obj4;
        Class<?> cls = bqlVar.c.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.e;
        if (cls != pointerInputEventHandler.getClass() || (z | z2)) {
            bqlVar.o();
        }
        bqlVar.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!a.ao(this.a, suspendPointerInputElement.a) || !a.ao(this.b, suspendPointerInputElement.b)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.d;
        return this.e == suspendPointerInputElement.e;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (((iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 961) + this.e.hashCode();
    }
}
