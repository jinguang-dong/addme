package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ouf {
    public static ContentResolver a;
    public final String b;
    public final Object c;

    protected ouf(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static ouf c(String str) {
        return new oud(str, false);
    }

    public abstract Object a();
}
