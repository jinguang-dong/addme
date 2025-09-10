package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erl extends erh {
    private static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public erl(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private static final InputStream e(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.eqv
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // defpackage.erh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object b(android.net.Uri r2, android.content.ContentResolver r3) throws java.io.FileNotFoundException {
        /*
            r1 = this;
            android.content.UriMatcher r1 = defpackage.erl.a
            int r1 = r1.match(r2)
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L14
            r0 = 5
            if (r1 == r0) goto L19
            java.io.InputStream r1 = r3.openInputStream(r2)
            goto L23
        L14:
            java.io.InputStream r1 = e(r3, r2)
            goto L23
        L19:
            android.net.Uri r1 = android.provider.ContactsContract.Contacts.lookupContact(r3, r2)
            if (r1 == 0) goto L3a
            java.io.InputStream r1 = e(r3, r1)
        L23:
            if (r1 == 0) goto L26
            return r1
        L26:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "InputStream is null for "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L3a:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = "Contact cannot be found"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erl.b(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // defpackage.erh
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
