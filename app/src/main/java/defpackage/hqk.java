package defpackage;

import android.content.UriMatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqk implements tzt {
    private final tzx a;

    public hqk(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final UriMatcher a() {
        String strA = ((hbq) this.a).a();
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(strA, "type/*", 1);
        uriMatcher.addURI(strA, "data/*", 2);
        uriMatcher.addURI(strA, "icon/#/badge", 3);
        uriMatcher.addURI(strA, "icon/#/interact", 4);
        uriMatcher.addURI(strA, "icon/#/dialog", 5);
        uriMatcher.addURI(strA, "delete/#", 6);
        uriMatcher.addURI(strA, "processing", 7);
        uriMatcher.addURI(strA, "processing/#", 8);
        uriMatcher.addURI(strA, "discover", 9);
        uriMatcher.addURI(strA, "discover/*", 10);
        return uriMatcher;
    }
}
