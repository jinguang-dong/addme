package defpackage;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rco implements rds {
    private final BlobStoreManager a;

    public rco(Context context) {
        this.a = (BlobStoreManager) context.getSystemService("blob_store");
    }

    private final ParcelFileDescriptor m(Uri uri) throws rcu {
        rcp.a(uri);
        return this.a.openBlob(BlobHandle.createWithSha256(rcp.d(uri.getPath()), "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
    }

    private final void n(byte[] bArr) throws IOException {
        try {
            this.a.releaseLease(BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }

    @Override // defpackage.rds
    public final /* synthetic */ File d(Uri uri) {
        return qsp.b(this, uri);
    }

    @Override // defpackage.rds
    public final InputStream e(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(m(uri));
    }

    @Override // defpackage.rds
    public final String f() {
        return "blobstore";
    }

    @Override // defpackage.rds
    public final boolean g(Uri uri) throws IOException {
        boolean z = false;
        try {
            ParcelFileDescriptor parcelFileDescriptorM = m(uri);
            if (parcelFileDescriptorM != null) {
                try {
                    if (parcelFileDescriptorM.getFileDescriptor().valid()) {
                        z = true;
                    }
                } finally {
                }
            }
            if (parcelFileDescriptorM != null) {
                parcelFileDescriptorM.close();
            }
        } catch (SecurityException unused) {
        }
        return z;
    }

    @Override // defpackage.rds
    public final /* synthetic */ void h(Uri uri) throws rcw {
        qsp.d(this);
    }

    @Override // defpackage.rds
    public final /* synthetic */ void i(Uri uri) throws rcw {
        qsp.e(this);
    }

    @Override // defpackage.rds
    public final void j(Uri uri) throws IOException {
        rcp.a(uri);
        if (!rcp.b(uri.getPath())) {
            n(rcp.d(uri.getPath()));
            return;
        }
        Iterator<BlobHandle> it = this.a.getLeasedBlobs().iterator();
        while (it.hasNext()) {
            n(it.next().getSha256Digest());
        }
    }

    @Override // defpackage.rds
    public final /* synthetic */ void k(Uri uri, Uri uri2) throws rcw {
        qsp.f(this);
    }

    @Override // defpackage.rds
    public final boolean l(Uri uri) {
        return false;
    }

    @Override // defpackage.rds
    public final /* synthetic */ long o(Uri uri) throws rcw {
        throw new rcw("fileSize not supported by blobstore");
    }

    @Override // defpackage.rds
    public final OutputStream p(Uri uri) throws IOException {
        rcp.a(uri);
        byte[] bArrD = rcp.d(uri.getPath());
        try {
            if (!rcp.c(uri.getPath())) {
                BlobHandle blobHandleCreateWithSha256 = BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                BlobStoreManager blobStoreManager = this.a;
                BlobStoreManager.Session sessionOpenSession = blobStoreManager.openSession(blobStoreManager.createSession(blobHandleCreateWithSha256));
                sessionOpenSession.allowPublicAccess();
                return new rcn(sessionOpenSession.openWrite(0L, -1L), sessionOpenSession);
            }
            BlobStoreManager blobStoreManager2 = this.a;
            if (blobStoreManager2.getRemainingLeaseQuotaBytes() <= 0) {
                throw new rct((byte[]) null);
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String query = uri.getQuery();
            if (TextUtils.isEmpty(query)) {
                throw new rcu(String.format("The uri query is null or empty, expected %s", "expiryDateSecs=<expiryDateSecs>"));
            }
            String queryParameter = uri.getQueryParameter("expiryDateSecs");
            if (queryParameter == null) {
                throw new rcu(String.format("The uri query is malformed, expected %s but found %s", "expiryDateSecs=<expiryDateSecs>", query));
            }
            blobStoreManager2.acquireLease(BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"), "String description needed for providing a better user experience", timeUnit.toMillis(Long.parseLong(queryParameter)));
            return null;
        } catch (LimitExceededException e) {
            throw new rct(e);
        } catch (IllegalStateException e2) {
            throw new IOException("Failed to write into BlobStoreManager", e2);
        }
    }

    @Override // defpackage.rds
    public final /* synthetic */ Iterable q(Uri uri) {
        return qsp.c(this);
    }
}
