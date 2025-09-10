package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0033e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C0033e("Unsupported " + str + " :" + serializable);
    }
}
