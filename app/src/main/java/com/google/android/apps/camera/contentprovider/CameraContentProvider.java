package com.google.android.apps.camera.contentprovider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.gzo;
import defpackage.hbl;
import defpackage.hbo;
import defpackage.hbp;
import defpackage.hkk;
import defpackage.hqa;
import defpackage.hrb;
import defpackage.hrd;
import defpackage.hre;
import defpackage.jsv;
import defpackage.pbn;
import defpackage.ree;
import defpackage.rvk;
import defpackage.rwc;
import defpackage.sgt;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraContentProvider extends ContentProvider {
    private hbo a;
    private ProviderInfo b;
    private volatile ree c;

    private final ree b() {
        ree reeVarB;
        ree reeVar = this.c;
        if (reeVar != null) {
            return reeVar;
        }
        synchronized (this) {
            reeVarB = this.c;
            if (reeVarB == null) {
                ProviderInfo providerInfo = this.b;
                providerInfo.getClass();
                hbp hbpVar = new hbp(this, providerInfo);
                HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
                hasCameraContentProviderComponent.getClass();
                hbl hblVarCameraContentProviderComponent = hasCameraContentProviderComponent.cameraContentProviderComponent(hbpVar);
                hblVarCameraContentProviderComponent.a().a();
                reeVarB = hblVarCameraContentProviderComponent.b();
                this.c = reeVarB;
            }
        }
        return reeVarB;
    }

    protected final void a() {
        hbo hboVar = this.a;
        if (hboVar != null) {
            String callingPackage = getCallingPackage();
            callingPackage.getClass();
            if (hboVar.a(callingPackage)) {
                return;
            }
        }
        throw new SecurityException();
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.b = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        a();
        if (!TextUtils.equals("version", str)) {
            return super.call(str, str2, bundle);
        }
        b();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 5);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 1;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not allowed on the CameraContentProvider");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Trace.beginSection("GCA_CameraContentProvider#onCreate");
        Context context = getContext();
        context.getClass();
        HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
        hasCameraContentProviderComponent.getClass();
        hasCameraContentProviderComponent.initAppComponent();
        this.a = new hbo(context, new HashSet(Arrays.asList(context.getResources().getStringArray(R.array.trusted_certificates))));
        Trace.endSection();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v5, types: [hqi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pbn] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ?? r0;
        a();
        Trace.beginSection("GCA_SpecialTypes#query");
        ree reeVarB = b();
        ?? r3 = reeVarB.f;
        r3.f("SpecialTypesQuery");
        hkk hkkVar = (hkk) reeVarB.b;
        int iMatch = ((UriMatcher) hkkVar.b).match(uri);
        if (iMatch == 1) {
            r0 = hkkVar.a;
        } else if (iMatch != 2) {
            switch (iMatch) {
                case 7:
                case 8:
                    r0 = hkkVar.c;
                    break;
                case 9:
                case 10:
                    r0 = hkkVar.d;
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized uri: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            r0 = hkkVar.e;
        }
        Cursor cursorA = r0.a(uri, strArr);
        r3.g();
        Trace.endSection();
        return cursorA;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not allowed on the CameraContentProvider");
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorE;
        a();
        Trace.beginSection(INRGuObcrHjSQz.pPnHTDkdFqkx);
        ree reeVarB = b();
        if (!"r".equals(str)) {
            throw new IllegalArgumentException("Unsupported mode: ".concat(String.valueOf(str)));
        }
        int iMatch = ((UriMatcher) reeVarB.c).match(uri);
        if (iMatch == 3) {
            parcelFileDescriptorE = reeVarB.e(uri, R.dimen.photos_oemapi_badge_icon_size);
        } else if (iMatch == 4) {
            parcelFileDescriptorE = reeVarB.e(uri, R.dimen.photos_oemapi_interact_icon_size);
        } else if (iMatch == 5) {
            parcelFileDescriptorE = reeVarB.e(uri, R.dimen.photos_oemapi_dialog_icon_size);
        } else {
            if (iMatch != 8) {
                throw new IllegalArgumentException("Unrecognized format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                Object obj = reeVarB.a;
                int i = hrb.b + 1;
                hrb.b = i;
                String str2 = "[r" + i + "]";
                long id = ContentUris.parseId(uri);
                final String str3 = str2 + "[m" + id + "] ";
                rwc rwcVarJ = rvk.a;
                String queryParameter = uri.getQueryParameter("width");
                String queryParameter2 = uri.getQueryParameter("height");
                if (queryParameter != null && queryParameter2 != null) {
                    rwcVarJ = rwc.j(new Size(Integer.parseInt(queryParameter), Integer.parseInt(queryParameter2)));
                }
                rwc rwcVarA = ((hrb) obj).f.a(id);
                if (!rwcVarA.h()) {
                    ((sgt) hrb.a.c().M(1470)).v("%s ProcessingMedia does not exist in ProcessingMediaManager", str3);
                    throw new hre("ProcessingMedia does not exist in ProcessingMediaManager");
                }
                hqa hqaVar = (hqa) rwcVarA.c();
                Bitmap bitmapB = hqaVar.b();
                if (bitmapB == null) {
                    ((sgt) hrb.a.c().M(1469)).v("%s thumbnail bitmap is not set in ProcessingMedia", str3);
                    throw new hre("Thumbnail bitmap is not set in ProcessingMedia");
                }
                if (bitmapB.isRecycled()) {
                    ((sgt) hrb.a.c().M(1468)).v("%s thumbnail bitmap has been recycled", str3);
                    throw new hre("Thumbnail bitmap has been recycled");
                }
                if (rwcVarJ.h()) {
                    pbn pbnVar = ((hrb) obj).c;
                    pbnVar.f("CAM_ProcessingMedia" + str3 + "Bitmap.createScaledBitmap#size=" + rwcVarJ.c().toString());
                    Object objC = rwcVarJ.c();
                    int width = bitmapB.getWidth();
                    int height = bitmapB.getHeight();
                    int width2 = ((Size) objC).getWidth();
                    int height2 = ((Size) objC).getHeight();
                    if (width > width2 || height > height2) {
                        if (width / height > width2 / height2) {
                            height2 = (height * width2) / width;
                        } else {
                            width2 = (width * height2) / height;
                        }
                        bitmapB = Bitmap.createScaledBitmap(bitmapB, width2, height2, false);
                    }
                    pbnVar.g();
                }
                int iA = hqaVar.a();
                if (iA != 0) {
                    pbn pbnVar2 = ((hrb) obj).c;
                    pbnVar2.f("CAM_ProcessingMedia" + str3 + "Bitmap.rotateBitmap#rotation=" + iA);
                    bitmapB = ((hrb) obj).g.p(gzo.bE) ? ((hrb) obj).e.a(bitmapB, iA) : jsv.I(bitmapB, iA);
                    pbnVar2.g();
                }
                bitmapB.getClass();
                ((hrb) obj).c.f(a.bw(str3, "CAM_ProcessingMedia", "BitmapSerializer.serialize"));
                try {
                    try {
                        hrd hrdVar = ((hrb) obj).d;
                        if (!rwcVarJ.h()) {
                            hrdVar = ((hrb) obj).h;
                        }
                        final ByteArrayOutputStream byteArrayOutputStreamA = hrdVar.a(bitmapB);
                        ((hrb) obj).c.g();
                        final hrb hrbVar = (hrb) obj;
                        parcelFileDescriptorE = ((ContentProvider) reeVarB.d).openPipeHelper(Uri.EMPTY, "", Bundle.EMPTY, "", new ContentProvider.PipeDataWriter() { // from class: hra
                            @Override // android.content.ContentProvider.PipeDataWriter
                            public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri2, String str4, Bundle bundle, Object obj2) {
                                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                                String str5 = "CAM_ProcessingMedia" + str3 + "ByteArrayOutputStream.writeTo#fd=" + String.valueOf(fileDescriptor);
                                hrb hrbVar2 = hrbVar;
                                hrbVar2.c.f(str5);
                                ByteArrayOutputStream byteArrayOutputStream = byteArrayOutputStreamA;
                                try {
                                    try {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileDescriptor));
                                        try {
                                            byteArrayOutputStream.writeTo(bufferedOutputStream);
                                            bufferedOutputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e) {
                                        ((sgt) ((sgt) hrb.a.b().i(e)).M(1465)).s("Error when writeTo the ParcelFileDescriptor");
                                    }
                                } finally {
                                    hrbVar2.c.g();
                                }
                            }
                        });
                    } catch (IOException e) {
                        throw new hre(e);
                    }
                } catch (Throwable th) {
                    ((hrb) obj).c.g();
                    throw th;
                }
            } catch (hre e2) {
                throw new FileNotFoundException("Cannot load thumbnail for URI= " + String.valueOf(uri) + " ex=" + e2.getMessage());
            }
        }
        Trace.endSection();
        return parcelFileDescriptorE;
    }
}
