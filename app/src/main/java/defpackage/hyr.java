package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.TfliteFileData;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hyr implements paf {
    public final /* synthetic */ pbn a;
    public final /* synthetic */ uem b;
    public final /* synthetic */ uem c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    private final /* synthetic */ int f;

    public /* synthetic */ hyr(pbn pbnVar, uem uemVar, uem uemVar2, Context context, String str, int i) {
        this.f = i;
        this.a = pbnVar;
        this.b = uemVar;
        this.c = uemVar2;
        this.d = context;
        this.e = str;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v19, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v22, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v31, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v34, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [sgt, shi] */
    @Override // defpackage.paf
    public final void a(Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd;
        AssetFileDescriptor assetFileDescriptorOpenFd2;
        int i = this.f;
        int length = 1;
        if (i == 0) {
            pbn pbnVar = this.a;
            pbnVar.f("KeplerGan#initialize");
            Gcam gcam = (Gcam) this.b.a();
            String str = this.e;
            Object objA = ((hyt) this.c).a();
            String[] strArr = {str, "base.tflite.uncompressed"};
            Context context = this.d;
            int i2 = swc.a;
            for (int i3 = 0; i3 < 2; i3++) {
                length += strArr[i3].length();
            }
            char[] cArr = new char[length];
            int i4 = 0;
            for (int i5 = 0; i5 < 2; i5++) {
                String str2 = strArr[i5];
                if (!str2.isEmpty()) {
                    if (i4 > 0 && cArr[i4 - 1] != '/') {
                        cArr[i4] = '/';
                        i4++;
                    }
                    int length2 = str2.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        char cCharAt = str2.charAt(i6);
                        if (cCharAt != '/') {
                            cArr[i4] = cCharAt;
                            i4++;
                        } else if (i4 <= 0 || cArr[i4 - 1] != '/') {
                            cCharAt = '/';
                            cArr[i4] = cCharAt;
                            i4++;
                        }
                    }
                }
            }
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd(new String(cArr, 0, i4));
            } catch (IOException e) {
                ((sgt) ((sgt) iav.a.b().i(e)).M((char) 1785)).s("Unable to get model asset file");
            } catch (RuntimeException e2) {
                ((sgt) ((sgt) iav.a.b().i(e2)).M((char) 1786)).s("Failed to initialize KeplerGan");
            }
            try {
                TfliteFileData tfliteFileData = new TfliteFileData(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                GcamModuleJNI.TfliteFileData_fd_get(tfliteFileData.a, tfliteFileData);
                ((NativeHdrPlusInterface) objA).nativeInitializeKeplerV1FromOpenFile(tfliteFileData.a, Gcam.a(gcam));
                if (assetFileDescriptorOpenFd != null) {
                    assetFileDescriptorOpenFd.close();
                }
                pbnVar.g();
                return;
            } finally {
                if (assetFileDescriptorOpenFd == null) {
                    throw th;
                }
                try {
                    assetFileDescriptorOpenFd.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        if (i != 1) {
            pbn pbnVar2 = this.a;
            pbnVar2.f("Walnut#initialize");
            Gcam gcam2 = (Gcam) this.b.a();
            Context context2 = this.d;
            String str3 = this.e;
            Object objA2 = ((hyt) this.c).a();
            try {
                assetFileDescriptorOpenFd2 = context2.getAssets().openFd(str3);
            } catch (IOException e3) {
                ((sgt) ((sgt) icg.a.b().i(e3)).M((char) 1828)).s("Unable to get model asset file.");
            } catch (RuntimeException e4) {
                ((sgt) ((sgt) icg.a.b().i(e4)).M((char) 1829)).s("Failed to initialize Walnut.");
            }
            try {
                ((NativeHdrPlusInterface) objA2).nativeInitializeWalnutFromOpenFile(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength(), Gcam.a(gcam2));
                if (assetFileDescriptorOpenFd2 != null) {
                    assetFileDescriptorOpenFd2.close();
                }
                pbnVar2.g();
            } finally {
                if (assetFileDescriptorOpenFd2 != null) {
                    try {
                        assetFileDescriptorOpenFd2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
        } else {
            pbn pbnVar3 = this.a;
            pbnVar3.f("Almond#initialize");
            Gcam gcam3 = (Gcam) this.b.a();
            Context context3 = this.d;
            String str4 = this.e;
            Object objA3 = ((hyt) this.c).a();
            try {
                assetFileDescriptorOpenFd2 = context3.getAssets().openFd(str4);
            } catch (IOException e5) {
                ((sgt) ((sgt) hwx.a.b().i(e5)).M((char) 1676)).s("Unable to get model asset file.");
            } catch (RuntimeException e6) {
                ((sgt) ((sgt) hwx.a.b().i(e6)).M((char) 1677)).s("Failed to initialize Almond.");
            }
            try {
                ((NativeHdrPlusInterface) objA3).nativeInitializeAlmondFromOpenFile(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength(), Gcam.a(gcam3));
                if (assetFileDescriptorOpenFd2 != null) {
                    assetFileDescriptorOpenFd2.close();
                }
                pbnVar3.g();
            } finally {
                if (assetFileDescriptorOpenFd2 != null) {
                    try {
                        assetFileDescriptorOpenFd2.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
        }
    }
}
