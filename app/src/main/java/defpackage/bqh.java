package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqh {
    public static final bpp a = new bpp(ufw.a);

    public static final bik a(bik bikVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return bikVar.cM(new SuspendPointerInputElement(obj, null, pointerInputEventHandler, 6));
    }

    public static final bik b(bik bikVar, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return bikVar.cM(new SuspendPointerInputElement(obj, obj2, pointerInputEventHandler, 4));
    }
}
