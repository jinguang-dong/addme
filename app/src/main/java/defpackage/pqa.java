package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqa {
    public static final pqa a = new qaq((byte[]) null, (byte[]) null).o();
    private final ContentValues b;

    public pqa(ContentValues contentValues) {
        this.b = contentValues;
    }

    public static qaq b(pqa pqaVar) {
        return new qaq(new ContentValues(pqaVar.b));
    }

    final ContentValues a() {
        return new ContentValues(this.b);
    }
}
