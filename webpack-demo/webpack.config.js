const path = require("path");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const { CleanWebpackPlugin } = require("clean-webpack-plugin");

module.exports = {
  entry: {
    app: "./src/index.js",
  },
     devtool: 'inline-source-map',
     devServer: {
             contentBase: './dist',
             hot: true,
             
           },
           module: {
                 rules: [
                   {
                     test: /\.css$/,
                     use: ['style-loader', 'css-loader'],
                   },
                 ],
               },
  plugins: [
    new CleanWebpackPlugin({ cleanStaleWebpackAssets: false }),
    new HtmlWebpackPlugin({
      title: "Output Management",
    }),
  ],
  mode: "development",
  output: {
    filename: "[name].bundle.js",
    path: path.resolve(__dirname, "dist"),
    publicPath: '/',
  },
};
